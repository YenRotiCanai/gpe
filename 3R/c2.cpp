#include <cstdio>
#include <cstdlib>
#include <cmath>

int main(){
    int cases, num, n, i;
    double p, pi;
    scanf("%d",&cases);

    for(num=0; num<cases; num++){
        scanf("%d%lf%d",&n, &p, &i);

        if(p<0.00001){
            printf("0.0000\n");
        }else{
            pi = pow(1-p, i-1) * p / (1-(pow(1-p,n)));
            printf("%.4lf\n",pi);
        }
    }
    return 0;
}