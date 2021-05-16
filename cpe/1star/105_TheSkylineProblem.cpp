//https://yuihuang.com/zj-d424/
#include <iostream>
#include <cmath>
#include <cstdio>

using namespace std;

int main(){
    int skyline[10005] = {0};
    int L, H, R;
    int minL = 10000, maxR = 0;

    while(cin >> L >> H >> R){
        //每次更新最大和最小的邊界
        minL = min(minL, L);
        maxR = max(maxR, R);

        //如果遇到比自己高的，就拿更高的那一個
        for(int i=L; i<R; i++){
            skyline[i] = max(skyline[i], H);
        }
        //if(L==1234 && H==1234 && R==1234) break;
    }

    H = -1; //預設最高為 -1
    bool first = true;

    //跑一遍陣列
    for(int i=minL; i<=maxR; i++){

        //只要遇到高度不一樣的，就印出來
        if(skyline[i] != H){

            if(!first) cout << " ";
            cout << i << " " << skyline[i];
            //印出不一樣的高度後，變更目前的高度
            H = skyline[i];
            first = false;
        }
    }
    cout << "\n";

    return 0;
}