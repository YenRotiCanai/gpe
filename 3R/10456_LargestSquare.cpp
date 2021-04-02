#include <cstdio>

int main(void){
    char map[101][101]; //開一個陣列放地圖
    int T; 
    scanf("%d", &T);

    while(T--){
        int M, N, Q;
        scanf("%d %d %d", &M, &N, &Q);

        for(int i=0; i<M; i++){
            scanf("%s", map[i]); //把地圖以 string 的方式讀進來
        }

        //題目要求先印出一部分
        printf("%d %d %d\n", M, N, Q);

        while(Q--){
            int r, c;
            scanf("%d %d", &r, &c);
            
            int ans = 1; //先預設地圖大小是 1
            for(int i=1; i<=M || i<= N; i++){ //確保在 M 和 N 的範圍內
                int flag = 0; //0 代表要繼續往外擴張

                //以 r,c 為中心，往上下左右各增加 1 來比對
                for(int a=r-i; a<=r+i; a++){
                    for(int b=c-i; b<=c+i; b++){

                        //如果超出邊界，flag = 1，停止尋找
                        if(a<0 || b<0 || a>=M || b>=N){
                            flag = 1;
                            break;
                        }

                        //如果字元比對起來不一樣，代表不是同一區
                        //flag = 1, 停止尋找
                        if(map[a][b]!=map[r][c]){
                            flag = 1;
                            break;
                        }
                    }
                }

                //如果上面兩個都沒問題，就代表擴張成功
                //答案增加 2 格（最大邊長：上和下各 +1）
                if(!flag) ans += 2;
                else break;
            }
            printf("%d\n", ans);
        }
    }
    return 0;
}