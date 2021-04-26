#include <iostream>
using namespace std;

int main(){
    long long int fib[51];
    fib[0] = 1;
    fib[1] = 1;
    for(int i=2; i<51; i++){
        fib[i] = fib[i-1]+fib[i-2];
    }

    int n;
    while(cin >> n && n){
        cout << fib[n] << endl;
    }
    return 0;
}