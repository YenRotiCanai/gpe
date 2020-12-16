//http://naivered.github.io/2018/04/01/Problem_Solving/UVa/UVa-10633-Rare-Easy-Problem/

#include <cstdio>

int main(){

    long long x;
    
    while(scanf("%lld", &x) && x){
    
        bool first = true;
    
        for(int i=9; i>=0; i--){
            if((x-i) % 9 == 0){
                if(!first) putchar(' ');

                printf("%lld", (long long)(x-i) / 9 * 10 + i);
                first = false;
            }
        }
        putchar('\n');
    }
    return 0;
}