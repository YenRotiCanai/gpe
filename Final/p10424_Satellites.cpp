#include <cstdio>
#include <cstring>
#include <cmath>
#define PI 2*acos(0.0)

int main(){
	double s, a;
	char unit[4];
	double arc, chord;

	while(scanf("%lf %lf %s", &s, &a, unit) >0){
		
		if(strcmp(unit, "min") == 0) a /= 60;

		if(a>180) a = 360-a;

		arc = 2 * PI * (s+6440) * a/360.0;
		chord = (s+6440) * sin(a*PI/2/180)*2;

		printf("%.6lf %.6lf\n", arc, chord);
	}
	return 0;
}