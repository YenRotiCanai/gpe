#include <cstdio>
using namespace std;

int main(){
    long long int n, ans;

    while(~scanf("%lld", &n)){
        printf("%lld\n", (n * n * (n+1) * (n+1)/4));
    }

    return 0;
}