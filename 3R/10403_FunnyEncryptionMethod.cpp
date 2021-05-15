#include <iostream>
using namespace std;

int main(){
    int N;
    cin >> N;
    while(N--){
        int m;
        cin >> m;

        int b1=0, b2=0;

        //10 進制轉 2 進制，每次取 mod 2 的值，然後自己要 /= 2
        //用 for 來跑，每次都讓 b1 來加總二進制的值，加到最後就知道有多少個 1 在裡面
        for(int v=m; v; v/=2){
            b1 += v%2;
        }

        //16 進制轉 2 進制，將每一個數字算出他自己的 2 進制，再全部加在一起
        //這樣寫的意思是每跑完一次後會 /=10
        for(; m; m/=10){ 
            //先取 m 的餘數，也就是取個位數，然後再把它轉成 2 進制
            for(int v=m%10; v; v/=2){
                b2 += v%2;
            }
        }
        

        cout << b1 << " " << b2 << endl;
    }
    return 0;
}