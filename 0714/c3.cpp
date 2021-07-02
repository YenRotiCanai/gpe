#include <iostream>
#include <cstdio>
#define N 10
using namespace std;
int main(){
    char str[N], rev[N];

    while(fgets(str, N, stdin)){
        int len = strlen(str)-1;
        reverse_copy(str, str+len, rev);

        for(int i=0; i < len; i++){
            putchar(rev[i]);
        }
    }
    return 0;
}