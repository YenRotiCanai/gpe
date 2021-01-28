//https://mypaper.pchome.com.tw/zerojudge/post/1326963460

#include<cstdio>
#include<cmath>

int main(){
    int cases;
    char s[1024];

    scanf("%d", &cases); //吃測資數量

    //吃兩個換行
    while(getchar()!='\n');
    while(getchar()!='\n');

    while(cases--){
        gets(s); //吃測資
        double x1, y1, x2, y2;
        double dist = 0;

        while(gets(s) && s[0] != '\0'){
            sscanf(s, "%lf %lf %lf %lf", &x1, &y1, &x2, &y2); //把測資分出去
            dist += hypot(x1-x2, y1-y2); //把距離累加
        }

        dist = dist / 1000; //換算成 km

        double hh = dist * 2 / 20; // *2 是因為每條路要來回一次

        int mm = (int)round(hh * 60);

        printf("%d:%02d\n", mm/60, mm%60);

        if(cases) puts("");
    }
    return 0;
}