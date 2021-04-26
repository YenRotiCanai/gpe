#include <iostream>
using namespace std;

int main(){
    int cases; cin >> cases;
    while(cases--){
        int len, n;
        cin >> len >> n;
        //先預設兩個最低為 -100 的
        int m = -100;
        int M = -100;

        for(int i=0; i<n; i++){
            int loc;
            cin >> loc;
            //拿 整體長度 減掉 實際位置
            //再分別取最大和最小的
            M = max(M, max(loc, len-loc));
            m = max(m, min(loc, len-loc));
        }
        cout << m << " " << M << endl;
    }
}