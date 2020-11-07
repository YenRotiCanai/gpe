#include <stdio.h>
#include <string.h>

//算 prime number，從 2 一直到 p 的sqrt
int prime(int p){
    int i;
    for(i=2; i*i<=p;i++){
        if(p%i==0) return 0; //如果可以整除，那他就不是質數
    }
    return 1;
}

char t[10000];
int main(){
    int i, a, b, c, num;
    memset(t, 0, sizeof(t)); //先把陣列都填滿 0
    while(scanf("%d %d", &a, &b) != EOF){
        c = 0; //記錄質數有多少
        for(i=a; i<=b; i++){
            if(t[i] == 0){
                num = i*i+i+41;
                if(prime(num)){
                    t[i] = 1;
                    c++;
                }else t[i] = 2;
            }else if(t[i] == 1) c++;
        }
        printf("%.2f\n", ((double)c/(b-a+1)*100)+0.00001); //+0.00001 修正誤差
    }
    return 0;
}