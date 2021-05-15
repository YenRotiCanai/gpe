#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;


int main(){
    int n, k, newK, total;

    while(scanf("%d %d", &n, &k) != EOF){
        newK = 0, total = n;

        while(n >= k){
            newK = n/k;
            total += newK;
            n = n % k + newK;
        }
        printf("%d\n", total);
    }
}