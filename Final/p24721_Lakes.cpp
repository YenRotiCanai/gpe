//http://liangalgorithm.blogspot.com/2013/04/uva722-lakesdfsbfs.html

#include <iostream> //cin
#include <cstdlib>
#include <cstdio> //getchar
#include <cstring> //memset, strlen

using namespace std;

int row, col;
int range;
char G[101][101]={0}, visit[101][101]={0};

void dfs(int x, int y){

    //先判斷他是不是超出陣列，或是已經走過了
    if(x<0 || y<0 || x>=row || y>=col || visit[x][y]=='1' || G[x][y]=='1') return;

    //如果沒有的話，就在 visit 設 1，表示已經走過
    visit[x][y] = '1';

    range++;

    dfs(x, y-1);
    dfs(x-1, y);
    dfs(x, y+1);
    dfs(x+1, y);

    return;

}

int main(){

    int n; //cases no.
    int i, j;
    int x, y;

    cin >> n;

    for(;n>0; n--){

        range = 0;
        row = 0;

        cin >> x >> y;

        memset(G,0,sizeof(G)); //初始化陣列為 0

        memset(visit,0,sizeof(visit)); //初始化陣列為 0

        getchar();//吃掉一空行

        while(gets(G[row]) && G[row][0]) {
            //cout << "G[row]:" << G[row] << ", [0]:" << G[row][0] << endl;

            row++;
        }

        //cout << G[1][0] << endl;
        //cout << row << endl;

        col = strlen(G[row-1]);

        dfs(x-1, y-1);

        cout << range << endl;

        if(n-1>0) cout << endl;

    }
    return 0;

}