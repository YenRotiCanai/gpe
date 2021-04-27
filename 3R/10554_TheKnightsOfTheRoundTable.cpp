#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

int main(){
    double a, b, c;
    while(scanf("%lf %lf %lf", &a, &b, &c) != EOF){
        if(a+b+c == 0) {
            printf("The radius of the round table is: 0.000\n");
            continue;
        }

        double s = (a+b+c)/2;
        double area = sqrt(s*(s-a)*(s-b)*(s-c));
        double r = (2*area)/(a+b+c);

        printf("The radius of the round table is: %.3lf\n", r);
    }
    return 0;
}