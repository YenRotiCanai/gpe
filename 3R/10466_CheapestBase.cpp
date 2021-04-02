#include <iostream>
using namespace std;

const int MX_BASE = 36;

int main(){
    int m;
    cin >> m;
    for(int k=1; k<=m; k++){
        if(k>1) cout << endl; //題目要求每一組輸出後要空一行
        
        cout << "Case " << k << ":" << endl;

        int priceTable[MX_BASE]; //開一個陣列來放36個墨水量

        for(int i=0; i<MX_BASE; i++){
            cin >> priceTable[i]; //讀入墨水量
        }

        //讀入測資數量
        int n;
        cin >> n;

        while(n--){
            int x;
            cin >> x;

            int cheapest[MX_BASE+1];
            for(int i=2; i<=MX_BASE; i++){
                int t=x;
                cheapest[i] = 0;

                //進位轉換過程就是一直取餘數，然後再把所有餘數串起來
                //所以他每取一次餘數，就可以直接查表看這個多少墨水，然後加起來
                //最後才用除的繼續進位轉換
                do{
                    cheapest[i] += priceTable[t%i];
                    t/=i;
                }while(t!=0);
            }

            //先預設第一個是最小的，後面再跑整個陣列看誰更小就取代掉他
            int min = cheapest[2];
            for(int i=3; i<=MX_BASE; i++){
                if(cheapest[i] < min) min = cheapest[i];
            }

            cout << "Cheapest base(s) for number " << x << ":";

            for(int i=2; i<=MX_BASE; i++){
                if(cheapest[i] == min) cout << " " << i;
            }

            cout << endl;
        }
    }
    return 0;
}