#include <cstdio>
#include <cmath>
#define MIN(X,Y) ((X>Y)? Y:X)

int main(){
    double L, W;
    double MaxX, MinX;

    while(scanf("%lf %lf", &L, &W) == 2){

        MaxX = ((L+W) - sqrt(L*L - L*W + W*W)) / 6.0;

        MinX = MIN(L,W) * 0.5;

        printf("%.3f %.3f %.3f\n", 
        MaxX + (1E-6), 0.0, MinX + (1E-6));

    }
    
    return 0;
}