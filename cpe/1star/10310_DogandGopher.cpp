/*https://github.com/morris821028/UVa/blob/master/volume103/10310%20-%20Dog%20and%20Gopher.c

計算兩點之間的最短距離
distance = square root( (x2-x1)^2 + (y2-y1)^2 )

因為這題的狗跑得比地鼠還要快 2 倍
地鼠 2 步 = 狗 1 步

地鼠 => 2 * square root( (x2-x1)^2 + (y2-y1)^2 )
等於
狗 => square root( (x2-x1)^2 + (y2-y1)^2 )

為了要把 squre root 消掉，兩邊都要再 square 一次
所以 地鼠的 2 會變成 4

*/
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

            //算距離
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