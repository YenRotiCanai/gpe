#include <cstdio>
#include <queue>
using namespace std;

#define MAX 35

//宣告地城大小和距離
char dungeon[MAX][MAX][MAX];
int distance[MAX][MAX][MAX];
int L, R, C; //輸入：L（層數），R（橫排/行），C（直排/列）
//走的方向
const int direction[6][3] = {{-1,0,0},{1,0,0},{0,-1,0},{0,1,0},{0,0,-1},{0,0,1}};

//宣告一個資料結構
struct loc{
    int x; int y; int z;
};

int main(){
    while(scanf("%d%d%d", &L, &R, &C)){
        if(!L && !R && !C) break;
        int start_i, start_j, start_k;

        for(int i=0; i<L; i++){
            for(int j=0; j<R; j++){
                scanf("%s", dungeon[i][j]);
                for(int k=0; k<C; k++){
                    if(dungeon[i][j][k]=='S'){
                        start_i = i;
                        start_j = j;
                        start_k = k;
                    }
                }
            }
        }
    }
}