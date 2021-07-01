#include <cstdio>
#include <cstring>
#include <algorithm>
#define N 100001
using namespace std;

int main(){
    char str[N], rev[N]; //用來存測資和 reverse 測資的陣列

    while(scanf("%s", str)){
        int fail[N] = { -1 }; //把第一個設為 -1
        int len = strlen(str);
        int i, j;
        reverse_copy(str, str+len, rev); //反轉字串並存到 rev 裡面

        for(i=1, j=-1; i<len; i++){
            printf("before: i:%d j:%d rev[i]:%c rev[j+1]:%c\n", i, j, rev[i], rev[j+1]);
            //當j走到一半了，而且相鄰的兩個不一樣，就把
            while(j >= 0 && rev[j+1] != rev[i]) j = fail[j];

            //如果前後都是一樣，就將 j 往後移，j++
            if(rev[j+1] == rev[i]) j++;

            fail[i] = j;
            printf("after: j:%d fail[i]:%d\n\n", j, fail[i]);
        }
    }
    return 0;
}