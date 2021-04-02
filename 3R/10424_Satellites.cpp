#include <cstdio>
#include <cstring>
#include <cmath>
#define PI 2*acos(0.0)

int main(){
    double s, a; //用 double 來算可以更精確
    char unit[4];
    double arc, chord;

    while(scanf("%lf %lf %s", &s, &a, unit) > 0){

        //如果輸入單位不是 deg 而是 min, 就要再除 60 得到 deg
        if(strcmp(unit,"min") == 0) a/=60; 

        //如果 a 大於 180，要用 360 來減掉，等下算 sin 才不會出錯
        if(a>180) a = 360-a;

        //按照公式來寫
        arc = 2 * PI * (s+6440) * a / 360.0;
        chord = (s+6440) * sin(a*PI/2/180) * 2;

        printf("%.6lf %.6lf\n", arc, chord);
    }
    return 0;
}