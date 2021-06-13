// 特殊情況： b 是 0 的話，就直接返回 a，因為不能除
#include <iostream>
using namespace std;

int gcd(int a, int b){
    if(b==0) return a;
    if(a%b==0) return b;
    else return gcd(b, a%b);
}

int main(){
    int a, b;
    int cases = 1;
    while(cin >> a >> b){
        cout << "case " << cases++ << ":" << endl;
        cout << gcd(a, b) << endl << endl;
    }
    return 0;
}