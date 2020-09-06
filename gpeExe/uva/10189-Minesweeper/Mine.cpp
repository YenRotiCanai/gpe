#include <cstdio>
using namespace std;

int n,m;
char field[105][105];

void Fill (int x,int y)
{
    /*這樣會可以把周圍的都 +1
    [-1,-1] [-1,0] [-1,1] 
    [0,-1] [0,0] [0,1] 
    [1,-1] [1,0] [1,1]
    */
    for (int i=-1; i<=1; i++)
        for (int j=-1; j<=1; j++)
            if (field[x+i][y+j]!='*')
                field[x+i][y+j]++;
}

int main(){
    int T = 1;
    while (scanf("%d %d",&n,&m))
    {
        if (!n && !m) break; //如果輸入是 0 的話，就 break
        if (T!=1) printf("\n"); //這是在第一個 case 結束後，開始第二個時，要空一行

        //初始化數量為0，先把每一個地雷都設為 0
        for(int i=1; i<=n; i++)
            for (int j=1; j<=m; j++)
                field[i][j]='0';

        //輸入，如果為'*'，則呼叫Fill將其八個方向數量+1
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                char c;
                c = getchar(); //這邊是抓輸入，可是有點不懂他下面的寫法，先不管
                while (c=='\n') c = getchar();

                if (c == '*'){ //如果有抓到 * ，就呼叫 Fill
                    field[i][j]='*';
                    Fill(i,j);
                }
            }
        }
        
        //輸出結果
        printf("Field #%d:\n",T++); //print field 的同時，把 T +1
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++)
                printf("%c",field[i][j]);
            printf("\n");
        }
    }
    return 0;
}