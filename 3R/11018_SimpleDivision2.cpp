//http://liangalgorithm.blogspot.com/2013/04/uva10407-simple-division.html
#include <algorithm>
#include <iostream>
#define MAX 10000
using namespace std;

//絕對值 abs 判斷
int abs(int a){
    return (a >= 0)? a : -a;
}

int gcd(int a, int b){
    if( a % b == 0) return b;
    return gcd(b, a % b);
}

int main(){
    int max, first;
    int n[MAX], num, i, j;
    int n_len = 0;

    while(true){
        while(cin >> num){
            //動態配置陣列大小，每吃一個測資長度就會+1，再把測資放進陣列
            if(num != 0) n[n_len++] = num;
            else break;
        }

        if(n_len == 0) break; //只有 0 的特殊測資

        sort(n, n+n_len); //排序

        //將每一個測資都減掉最小的那個
        for(i=1; i<n_len; i++){
            n[i] -= n[0];
        }

        max = 0;

        for(i = 1, first = 0; i < n_len; i++){
            for(j = i+1; j <= n_len; j++){

                if(n[j] - n[i] != 0){ //如果陣列裡的兩個都不是 0
                    
                    //先判斷是不是第一次算 gcd，如果是第一次，就先跑 gcd 然後把他給 max
                    //之後
                    if(first == 0){
                        max = gcd(n[j], n[i]);
                        first = 1;
                    }else{
                        max = gcd(abs(n[i]), max);
                    }
                }
            }
        }

        cout << max << endl;
        for(i = 0; i<n_len; i++) n[i] = 0;
        n_len = 0;
    }
    return 0;
}