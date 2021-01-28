#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;

int main(){
	int m, n, t;
	while(scanf("%d %d %d", &m, &n, &t)!=EOF){
		
		//把 m 設為最小的單位
		if(m>n){
			int tmp = m;
			m = n;
			n = tmp;
		}

		int totalBurger = t / m;
		int remainTime = t % m;

		for(int i = totalBurger-1; i>=0 && remainTime!=0; i--){
			int newRemainTime = t - (i * m);
			int newTotalBurger = newRemainTime / n; //計算可以另外加多幾個大的？
			newRemainTime = newRemainTime - (newTotalBurger * n); //加了大 B 之後還剩多少時間？

			//如果新的剩餘時間比原本的少的話，就重新調整總數
			//總數 = i（扣除後剩下的）+ 新加入的
			//重設剩餘時間
			if(newRemainTime < remainTime){
				totalBurger = i + newTotalBurger;
				remainTime = newRemainTime;
			}
		}
		printf("%d", totalBurger);
		if(remainTime > 0) printf(" %d",remainTime);
		printf("\n");
	}
	return 0;
}