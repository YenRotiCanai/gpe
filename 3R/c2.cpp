#include <cstdio>
#include <queue>
using namespace std;

char dungeon[32][32][32]; //宣告地城大小
int Distance[32][32][32];
int L, R, C; // L=no. of level, R=rows(橫排/行), C=columns(直排/列)

//走的方向：往下層、往上層、往左、往右、往上、往下
const int direction[6][3] = {{-1,0,0},{1,0,0},{0,-1,0},{0,1,0},{0,0,-1},{0,0,1}};

//宣告一個結構
struct point_type{
    int x; int y; int z;
};

int BFS(int i, int j, int k){
    Distance[i][j][k] = 0; //先預設距離為 0
    queue<point_type> q; //宣告一個以 point_type 為結構的 queue
    q.push(point_type{i,j,k});
}

int main(){
    while(scanf("%d%d%d", &L, &R, &C)){
        if(!L && !R && !C) break;
        int start_i, start_j, start_k;

        //把整個 3D 迷宮讀進來，先跑兩個循環，分別是樓層和橫排的
        for(int i=0; i<L; i++){
            for(int j=0; j<R; j++){
                scanf("%s", dungeon[i][j]);
                for(int k=0; k<C; k++){ //這裏是跑到每一樓層，橫排的每一間房間
                    if(dungeon[i][j][k] == 'S'){
                        start_i = i;
                        start_j = j;
                        start_k = k;
                    }
                }
            }
        }

        int minute = BFS(start_i, start_j, start_k);
    }
}