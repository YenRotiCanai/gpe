//http://naivered.github.io/2016/05/20/Problem_Solving/UVa/UVa-11475-Extend-to-Palindrome/
#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
#define N 100001
using namespace std;

int main(){
    char str[N], rev[N];
    while(gets(str)){

        int fail[N] = { -1 };
        int len = strlen(str);
        int i, j;
        reverse_copy(str, str+len, rev);

        for(i=1, j=-1; i<len; i++){
            while(j >= 0 && rev[j+1] != rev[i]) j = fail[j];

            if(rev[j+1] == rev[i]) j++;

            fail[i] = j;
        }

        for(i=0, j=-1; i<len; i++){
            while(j >= 0 && rev[j+1] != str[i]) j = fail[j];

            if(rev[j+1] == str[i]) j++;
        }

        for(i=0; i<len; i++) putchar(str[i]);

        for(++j; j<len; j++) putchar(rev[j]);
        putchar('\n');
    }
}