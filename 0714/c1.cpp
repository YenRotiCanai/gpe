#include <iostream>
#include <climits>
#include <cstdio>

using namespace std;

int main(){
    int n;
    int cases = 1;
    while(cin >> n){

        long long fib[n+5];
        fib[0] = 0;
        fib[1] = 1;

        bool over = false;

        for(int i=2; i<=n; i++){
            fib[i] = fib[i-1] + fib[i-2];

            if(fib[i] > UINT_MAX){
                over = true;
                break;
            }
        }

        printf("case %d:\n", cases++);

        if(over) printf("overflow\n\n");
        else printf("%lld\n\n", fib[n]);
    }
    return 0;
}