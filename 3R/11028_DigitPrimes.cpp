//題目要求只要找一次他們的 digit sum 就好
//不用重複找到剩下個位數
#include <iostream>
#include <cmath>
#include <cstdio>
#define Size 1000000
using namespace std;

int prime[1000000] = {0};
int main(){
    prime[0] = prime[1] = 1;
    for(int i=2; i<Size; i++){
        if(!prime[i]){
            for(int j=i+i; j<Size; j+=i){
                prime[j] = 1;
            }
        }
    }
    int cases, a, b;
    scanf("%d", &cases);
    while(cases--){
        int digitprime = 0;
        scanf("%d%d", &a, &b);
        for(int i=a; i<=b; i++){
            if(!prime[i]){
                int all = 0, k=i;
                while(k>0){
                    all += k%10;
                    k/=10;
                }
                if(!prime[all]) digitprime++;
            }
        }
        printf("%d\n", digitprime);
    }
    return 0;
}