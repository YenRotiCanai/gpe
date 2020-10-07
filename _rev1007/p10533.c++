#include <cstdio>
#include <cmath>
#include <algorithm>

using namespace std;

bool cmp(int a, int b){
	return a > b;
}

int cost[1010];
int main(){
	int n, avg, rem, ans, t1, t2;
	while(scanf("%d", &n) && n!= 0){ //先吃人數
		ans = avg = 0; //初始化 ans 和 avg 為 0
		
		for(int i=0; i<n; i++){
			scanf("%d.%d", &t1, &t2);
			cost[i] = t1 * 100 + t2;
			avg += cost[i];
		}

		rem = avg % n; //要多付或是少付的人數

		avg /= n; //平均

		sort(cost, cost+n, cmp); //sort 第三個 para 也就是上面的那個func可以讓他從大排到小

		for(int i=0; i<rem; i++){
			ans += abs(cost[i] - (avg+1));
		}
		for(int i=rem; i<n; i++){
			ans += abs(cost[i] - avg);
		}
		printf("$%.2f\n",ans/200.0 );
	}
	return 0;
}