#include <cstdio>
#include <cstring>

bool prime(int n){
    for(int i=2; i*i<=n; i++){
        if(n % i == 0) return false;
    }
    return true;
}

char t[10000]; //建表格
int main(){
    memset(t, 0, sizeof(t)); //先把表格都填滿 0；0代表沒記錄過
    int a, b, num;

    while(scanf("%d %d", &a, &b) != EOF){
        int count = 0;
        for(int i=a; i<=b; i++){
            //如果表格裡面沒記錄過
            if(t[i]==0){
                num = i*i + i + 41; //題目給的 formula
                //檢查他是不是質數
                if(prime(num)){
                    t[i] = 1;
                    count ++;
                }else t[i] = 2;
            }else if(t[i]==1) count++;
        }
        //+0.00001 修正誤差
        printf("%.2f\n", ((double)count/(b-a+1)*100)+0.00001); 
    }
    return 0;
}