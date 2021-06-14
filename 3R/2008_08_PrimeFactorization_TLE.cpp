#include <iostream>
#include <cmath>
#include <map>
#include <cstdio>

using namespace std;

int main(){
    unsigned long n;
    map<int,int> mp;
    map<int,int>::iterator iter;

    while(scanf("%lu", &n) && n!=-1){
        mp.clear();
        
        //找出因數，用 map 來統計出現過多少次
        for(int i=2; i<sqrt(n); i++){
            while(n%i == 0){
                cout << "in" << endl;
                mp[i]++;
                n /= i;
            }
        }
        if(n>2) mp[n]++; //最後一個因數

        //印出題目要的
        for(iter = mp.begin(); iter!=mp.end(); iter++){
            printf("(%d,%d)", iter->first, iter->second);
        }
        printf("\n");

        int num = 1;
        unsigned long sum = 1;
        int pow_result;
        int p;
        
        //根據題目的 formula 來算 no. of divisor 和 sum of divisor
        for(iter = mp.begin(); iter!=mp.end(); iter++){
            int a = iter->first;
            int b = iter->second;

            //算 no. of divisor
            num *= (b+1);

            //算 sum of divisor
            p = 0;
            for(int i=0; i<=b; i++){
                pow_result = (int)(pow(a, i)+0.5);
                p += pow_result;
            }
            sum *= p;
        }
        printf("%d\n%lu\n===\n", num, sum);
    }
    return 0;
}