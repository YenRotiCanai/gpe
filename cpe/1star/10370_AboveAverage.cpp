//https://knightzone.studio/2011/12/14/1269/uva%EF%BC%9A10370%EF%BC%8Dabove-average/
#include <iostream>
#include <cstdio>
using namespace std;

int main(){
    int c, n;
    float arr[1005]; //這個一定要先宣告，不然會 RE 或 WA 樣樣來

    while(cin >> c && c){
        
        for(int i=0; i<c; i++){
            cin >> n;

            float total = 0.0;
            for(int i=0; i<n; i++){
                cin >> arr[i];
                total += arr[i];
            }

            float avg = total / n;
            float count = 0.0;
            for(int i=0; i<n; i++){
                if(arr[i] > avg) count++;
            }

            float p = count / n * 100;

            printf("%.3f%%\n", p);
        }
    }
    return 0;
}