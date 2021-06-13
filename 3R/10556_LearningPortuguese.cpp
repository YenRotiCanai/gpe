//https://mypaper.pchome.com.tw/zerojudge/post/1324765674
//這題不能用 java，只能用 c++
#include <cstdio>
#include <cstring>

int main(){
    char s1[105], s2[105];
    int cases = 0;

    while(scanf("%s %s", s1, s2) == 2){
        if(cases) puts(""); //如果不是第一筆資料，就換行
        cases++;

        printf("%s (to %s)\n", s1, s2);
        int len = strlen(s1);
        if(len < 2 || (strcmp(s1+len-2, "ar") && (strcmp(s1+len-2, "er") && strcmp(s1+len-2, "ir")))){
            puts("Unknown conjugation");
            continue;
        }

        char tv = s1[len-2];
        s1[len-2] = '\0';

        if(tv == 'i'){
            printf("eu        %so\n", s1);
            printf("tu        %ses\n", s1);
            printf("ele/ela   %se\n", s1);
            printf("n%cs       %s%cmos\n", (unsigned char)243, s1, tv);
            printf("v%cs       %s%cs\n", (unsigned char)243, s1, tv);
            printf("eles/elas %sem\n", s1);
        }else{
            printf("eu        %so\n", s1);
            printf("tu        %s%cs\n", s1, tv);
            printf("ele/ela   %s%c\n", s1, tv);
            printf("n%cs       %s%cmos\n", (unsigned char)243, s1, tv);
            printf("v%cs       %s%cis\n", (unsigned char)243, s1, tv);
            printf("eles/elas %s%cm\n", s1, tv);
        }
    }
    return 0;
}