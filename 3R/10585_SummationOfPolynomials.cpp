//https://bruce30262.pixnet.net/blog/post/88223717-%5Bc-c%2B%2B%5D-uva-10302-summation-of-polynomials
// n * n * (n+1) * (n+1)/4
#include <cstdio>
using namespace std;

int main(){
    long long int n, ans;

    while(~scanf("%lld", &n)){
        printf("%lld\n", (n * n * (n+1) * (n+1)/4));
    }

    return 0;
}