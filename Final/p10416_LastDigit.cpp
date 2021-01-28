//http://diadoacm.blogspot.com/2013/02/acm-10162-last-digit.html

#include <cstdio>
#include <cstring>

int table[2][10] = {
    {0,1,4,7,6,5,6,3,6,9},
    {0,1,6,3,6,5,6,7,4,9}
};

int main(void){
    int i, result, tens, len;
    char s[101+1];

    while(scanf("%s", &s) == 1 && !(s[0]=='0' && s[1]=='\0')){
        len = strlen(s);

        if(len >= 2) tens = s[len-2]-'0';
        else tens = 0;

        result = tens*7;

        for(i=1; i<=s[len-1]-'0'; i++){
            result += table[tens%2][i];
        }

        printf("%d\n", result%10);
    }
    return 0;
}