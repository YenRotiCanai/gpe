#include <iostream>
#include <cstdlib>
#include <cstdio>
using namespace std;

int main(){
    int hour, minute;
    while(scanf("%d:%d", &hour, &minute)!=EOF){
        if(hour == 0 && minute == 0) break;

        double angleHr, angleMin;
        angleHr = 30*hour + 0.5*minute;
        angleMin = 6*minute;

        double ans = angleHr - angleMin;

        if(ans < 0) ans = -ans;
        if(ans > 180) ans = 360 - ans;

        printf("%.3f\n", ans);
    }
}