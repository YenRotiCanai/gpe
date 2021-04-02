#include <iostream>

using namespace std;

int h[100]; //罷工週期

int main(){
    int T, N, P;
    cin >> T;
    while(T--){
        cin >> N >> P;
        int day[3651];

        //先把陣列裡面全部設成 0
        for(int i=0; i<=3650; i++) day[i] = 0;

        for(int i=0; i<P; i++){
            cin >> h[i];
            //將每一次罷工的日期都標記成 1
            //for 迴圈的第三項要用罷工的週期
            for(int j=h[i]; j<=N; j+=h[i]) day[j] = 1;
        }

        //最後統計除了五六日以外，有多少個被標記的日期
        int count = 0;
        for(int j=1; j<=N; j++){
            if(j%7==6 || j%7==0) continue;
            if(day[j]==1) count++;
        }
        cout << count << endl;
    }
    return 0;
}