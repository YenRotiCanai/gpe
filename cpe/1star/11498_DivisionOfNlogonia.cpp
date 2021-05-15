//https://knightzone.studio/2012/09/19/1918/uva%EF%BC%9A11498%EF%BC%8Ddivision-of-nlogonia/
//找出對應的位置
//照題目的要求把五種判斷寫出來
#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    int K, N, M, x, y;
    while(scanf("%d", &K) != EOF && K){
        scanf("%d %d", &N, &M);

        for(int i=0; i<K; i++){
            scanf("%d %d", &x, &y);

            //先看 y 軸，如果測資比中心大，就是上；如果比較小就是下
            //之後才看 x, 如果測資比較小，就是左；如果比較大就是右
            if(N==x or M==y) printf("divisa");
            else{
                if(y>M) printf("N");
                else printf("S");

                if(x>N) printf("E");
                else printf("O");
            }
            printf("\n");
        }
    }
    return 0;
}