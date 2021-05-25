#include <cstdio>

int main(){
    int n;
    double x1, y1, x2, y2;

    while(scanf("%d %lf %lf %lf %lf", &n, &x1, &y1, &x2, &y2) == 5){
        bool escape = false;
        double x, y, ansx, ansy;

        while(n--){
            scanf("%lf %lf", &x, &y);
            if(escape) continue;

            if(4*((x1-x)*(x1-x) + (y1-y)*(y1-y)) <= (x2-x)*(x2-x) + (y2-y)*(y2-y)){
                escape = true;
                ansx = x;
                ansy = y;
            }
        }

        if(escape) printf("The gopher can escape through the hole at (%.3lf,%.3lf).\n", ansx, ansy);
        else puts("The gopher cannot escape.");
    }

    return 0;
}