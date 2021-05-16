//https://knightzone.studio/2012/03/14/1477/uva%EF%BC%9A108%EF%BC%8Dmaximum-sum/
//for loop 從 1 開始跑，保留最上面的 0 讓他拿來加
#include <iostream>
#include <cstdio>
#include <climits>
using namespace std;
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    int n;
    int arr[105][105];
    int max_sum, sum;
    while(scanf("%d", &n) != EOF){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                scanf("%d", &arr[i][j]);
            }
        }

        //計算每一列的連續和
        int col_arr[105][105] = {0};
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                col_arr[i][j] = col_arr[i-1][j]+arr[i][j];
            }
        }

        max_sum = INT_MIN;

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                sum = 0;

                for(int k=1; k<=n; k++){
                    sum += col_arr[j][k] - col_arr[i-1][k];

                    if(sum > max_sum) max_sum = sum;
                    if(sum < 0) sum = 0;
                }
            }
        }
        printf("%d\n", max_sum);
    }

    return 0;
}