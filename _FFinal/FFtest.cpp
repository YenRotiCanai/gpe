#include <iostream>
#include <cstdio>

using namespace std;

int main(){
    long long dp[10] = {1};

    for(int i=0; i<10; i++){
        printf("%lld ",dp[i]);
    }
    
    //金錢面額*100，總共有11種
    int money[] = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
    
    //分成兩個部分來取測資
    int part1, part2;

    //總共 11 種面額，由小到大來做
    for(int i=10; i>=0; i--){
        for(int j=money[i]; j<=30000; j++){
            dp[j] += dp[j-money[i]];
        }
    }

    while(scanf("%d.%d", &part1, &part2) != EOF && !(part1 == 0 && part2 == 0))
        printf("%3d.%02d%17lld\n", part1, part2, dp[part1*100+part2]);

    return 0;
}