#include <cstdio>
#include <queue>
using namespace std;

char dungeon[32][32][32]; //宣告地城大小
int Distance[32][32][32];
int L, R, C; // L=no. of level, R=rows(橫排/行), C=columns(直排/列)

//走的方向：往左、往右、往下、往上、下一層、上一層
const int direction[6][3] = {{-1,0,0},{1,0,0},{0,-1,0},{0,1,0},{0,0,-1},{0,0,1}};

//宣告一個結構
struct point_type{
    int x; int y; int z;
};

int BFS(int i, int j, int k){
    Distance[i][j][k] = 0; //先預設距離為 0
    point_type cur={i,j,k}, nxt; //以 point_type 為結構，宣告一個目前位置和下一個位置
    queue<point_type> q; //宣告一個以 point_type 為結構的 queue
    q.push(cur); //把起始位置放到 queue 裡面
    dungeon[i][j][k] = '#'; //把已經放進 queue 的座標關起來（避免他再次被放進去）

    
    while(!q.empty()){ //當 q 有東西的時候
        cur = q.front(); //把 q 的第一個設為 cur
        q.pop(); //然後把第一個丟出去

        //總共有 6 個方向
        for(int i=0; i<6; i++){
            nxt.x = cur.x + direction[i][0];
            nxt.y = cur.y + direction[i][1];
            nxt.z = cur.z + direction[i][2];

            //如果超出邊界，就跳下一輪 for
            if(nxt.x<0 || nxt.x >= L || nxt.y<0 || nxt.y >= R || nxt.z<0 || nxt.z >= C) continue;

            if(dungeon[nxt.x][nxt.y][nxt.z] != '#'){
                Distance[nxt.x][nxt.y][nxt.z] = Distance[cur.x][cur.y][cur.z] + 1;
                
                if(dungeon[nxt.x][nxt.y][nxt.z] == 'E') return Distance[nxt.x][nxt.y][nxt.z];

                dungeon[nxt.x][nxt.y][nxt.z] = '#';
                q.push(nxt);
            }
        }
    }
    return -1;
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

        if(minute != -1) printf("Escaped in %d minute(s).\n", minute);
        else printf("Trapped!\n");
    }
    return 0;
}