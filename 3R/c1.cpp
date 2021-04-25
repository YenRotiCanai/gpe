#include <cstdio>

int m, n;
char Map[110][110];
bool Collected[110][110];

void CollectOil(int i, int j){
    if(i<0 || j<0 || i>=m || j>=n) return;
    else if(Map[i][j]=='*' || Collected[i][j]==true) return;
    else{
        Collected[i][j] = true;
        CollectOil(i-1,j-1);
        CollectOil(i-1,j);
        CollectOil(i-1,j+1);
        CollectOil(i,j-1);
        CollectOil(i,j+1);
        CollectOil(i+1,j-1);
        CollectOil(i+1,j);
        CollectOil(i+1,j+1);
    }
}

int main(){
    scanf("%d %d", &m, &n);
    while(n!=0 || m!=0){
        for(int i=0; i<m; i++){
            scanf("%s", &Map[i]);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Collected[i][j] = false;
            }
        }

        int sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(Map[i][j] == '@' && Collected[i][j] == false){
                    sum++;
                    CollectOil(i, j);
                }
            }
        }
        printf("%d\n", sum);
    }    
    return 0;
}