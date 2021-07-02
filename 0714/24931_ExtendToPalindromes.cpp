#include <cstdio>
#include <cstring>
#include <algorithm>
#define N 100001
using namespace std;

int main(){
    char str[N], rev[N]; //用來存測資和 reverse 測資的陣列

    while(gets(str)){
        int fail[N] = { -1 }; //把第一個設為 -1
        int len = strlen(str);
        int i, j;
        reverse_copy(str, str+len, rev); //反轉字串並存到 rev 裡面

        //failure function
        for(i=1, j=-1; i<len; i++){
            //printf("before: i:%d j:%d rev[i]:%c rev[j+1]:%c\n", i, j, rev[i], rev[j+1]);
            
            //如果 j 走到一半了（代表前面有相同的），可是相鄰的有不一樣，就把 j 改成 fail[j] 的值
            while(j >= 0 && rev[j+1] != rev[i]) j = fail[j];

            //如果前後都是一樣，就將 j 往後移，j++
            if(rev[j+1] == rev[i]) j++;

            //TO-DO 還要想想
            //最後的 j 就是 fail 值，應該？
            fail[i] = j;

            //printf("after: j:%d fail[i]:%d\n\n", j, fail[i]);
        }

        //匹配，和 failure func 差不多
        for(i = 0, j = -1; i < len; i++){
            while(j>=0 && rev[j+1] != str[i]) j = fail[j];

            if(rev[j+1] == str[i]) j++;
        }

        for(i = 0; i<len; i++) putchar(str[i]);

        for(j++; j<len; j++) putchar(rev[j]);

        putchar('\n');
    }
    return 0;
}