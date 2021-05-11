//https://knightzone.studio/2012/01/18/1346/uva%EF%BC%9A10336%EF%BC%8Drank-the-languages/
#include <iostream>
#include <cstdio>
#include <cstring>

using namespace std;

char map[1000][1000] = {0};
bool visited[1000][1000] = {0};

void DFS(int x, int y){
    visited[x][y] = 1;
    if(map[x+1][y] == map[x][y] && !visited[x+1][y]) DFS(x+1, y);
    if(map[x-1][y] == map[x][y] && !visited[x-1][y]) DFS(x-1, y);
    if(map[x][y+1] == map[x][y] && !visited[x][y+1]) DFS(x, y+1);
    if(map[x][y-1] == map[x][y] && !visited[x][y-1]) DFS(x, y-1);
}

int main(){
    int N, H, W, maxArea;
    while(scanf("%d", &N) != EOF){
        for(int i=1; i<=N; i++){
            scanf("%d%d", &H, &W);
            getchar();

            memset(visited, 0, sizeof(visited));

            int letters[30] = {0};
            maxArea = 0;

            for(int j=1; j <= H; j++){
                for(int k=1; k <= W; k++) scanf("%c", &map[j][k]);
                getchar();
            }

            for(int j=1; j <= H; j++){
                for(int k=1; k<=W; k++){
                    if(!visited[j][k]){
                        maxArea = max(++letters[map[j][k] - 'a'], maxArea);
                        DFS(j, k);
                    }
                }
            }
            printf("World #%d\n", i);
            for(int j=maxArea; j>=1; j--){
                for(int k=0; k<26; k++){
                    if(letters[k] == j) printf("%c: %d\n", 'a'+k, j);
                }
            }
        }
    }
    return 0;
}