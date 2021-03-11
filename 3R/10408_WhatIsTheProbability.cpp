#include <cstdio>
#include <cstdlib>
#include <cmath>

int main(){
    int sets, n, i; //sets=測資數量，n=參加人數，i=第 i 個人
    double p, pi; //p=事件機率，pi=答案的機率
    scanf("%d",&sets);

    for(int num=0; num<sets; num++){
        scanf("%d%lf%d",&n, &p, &i);

        if(p<0.00001){ //如果機率太小，就直接輸出 0.0000
            printf("0.0000\n");
        }else{
            //基本把這個背起來就可以了
            pi = pow(1-p, i-1) * p / (1-(pow(1-p,n)));
            printf("%.4lf\n",pi);
        }
    }
    return 0;
}