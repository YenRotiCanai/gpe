#include <iostream>
#include <algorithm>
using namespace std;

//gcd function
int gcd(int a, int b){
    while(a %= b) swap(a,b);
    return b;
}

int main(){
    int v[1001];
    while(cin >> v[0] && v[0]){
        int n=1;
        int M, m;
        M = m = v[0];
        
        while(cin >> v[n] && v[n]){
            M = max(M, v[n]); //找出最大
            m = min(m, v[n]); //找出最小
            n++;
        }

        int g = M-m; //設定初始 gcd 為 g
        for(int k=0; k<n; k++){
            g = gcd(v[k]-m, g); //所有的值減掉最小的 m 後，和 g 拿去做 gcd，再把 g 給回自己
        }
        cout << g << endl; // 最後的 g 就是答案
    }
    return 0;
}