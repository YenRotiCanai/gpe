#include <iostream>

using namespace std;

int F(int n){
    if(n==0) return 0;
    else if(n%10 > 0) return n%10;
    else return F(n/10);
}

int main(){
    int p, q;
    while(cin >> p >> q){
        if(p<0 && q<0) break;
        int sum = 0;
        for(int i=p; i<=q; i++){
            sum += F(i);
        }
        cout << sum << endl;
    }
}