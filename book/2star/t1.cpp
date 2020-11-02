#include <stdio.h>
#include <math.h>
#define MIN(X,Y) ((X>Y)? Y:X)

using namespace std;

int main(){
	double L, W;
	double MaxX, MinX;
	while(scanf("%lf %lf", &L, &W)==2){
		MaxX = ((L+W)-sqrt(L*L-L*W+W*W))/6.0;
		MinX = MIN(L,W)*0.5;
		printf("%.3lf %.3lf %.3lf\n", MaxX+(1E-6), 0.0, MinX+(1E-6));
	}
	return 0;
}