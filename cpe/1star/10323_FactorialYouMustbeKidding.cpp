//https://bruce30262.pixnet.net/blog/post/88223575
//注意有負數，如果是 even 的話是 underflow，odd 就是 overflow
//13！=6227020800，7！<10000<8！
#include <cstdio>

int main(){
    long long int n, ans, fac;
    bool over = false;

    while(scanf("%lld",&n)!=EOF){
        
        //先判斷是不是負數
        //如果是 -ve even, 那就是 Underflow
        //而 -ve odd，就是 Overflow
        if(n<0){
            n = 0 - n;
            if(n % 2 == 0) puts("Underflow!");
            else puts("Overflow!");
        }else{

            //正常的話，就先一直算到他超出，一旦超出就break，然後輸出訊息
            //沒有超出的話，再來看他是不是太低或者是正常的
            fac = 1;
            over = false;

            //開始計算
            for(int i = 1; i<=n; i++){
                fac = fac * i;

                //只要超過這個數字，就不要算了
                if(fac > 6227020800){
                    puts("Overflow!");
                    over = true;
                    break;
                }
            }

            //如果沒有超過
            if(!over){
                if(fac < 10000) puts("Underflow!");
                else printf("%lld\n", fac);
            }
        }
    }
    return 0;
}