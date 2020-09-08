//http://kaibro.logdown.com/posts/256635-uva-10137-the-trip

#include<cstdio>
#include<cmath>
#include<algorithm>
//#include<iostream>
using namespace std;

bool cmp(int a, int b){
	return a > b;
}

int cost[1010];
int main(){
	int n, avg, rem, ans, t1, t2;
	while(scanf("%d", &n) && n != 0){ //n=學生數量
		ans = avg = 0; //初始化 ans 和 avg 為 0
		for(int i=0; i<n; i++){
			scanf("%d.%d", &t1, &t2); //輸入金額
			cost[i] = t1 * 100 + t2;
			avg += cost[i];

			// printf("i:%d, t1:%d, t2:%d, cost[i]:%d, avg:%d\n",i,t1,t2,cost[i],avg ); 
		}
		rem = avg % n; //要多付或少付的人數
		// cout<<"rem:"<<rem<<endl;

		avg /= n;
		// cout<<"avg:"<<avg<<endl;

		sort(cost, cost + n, cmp); //sort的第三個para是讓他descending(從大到小)排序

		for(int i=0; i<rem; i++){
			// printf("i:%d, ans:%d, cost[%d]:%d, avg:%d",i,ans,i,cost[i],avg);

			ans += abs(cost[i] - (avg+1)); //這邊的avg多一個+1

			// printf(", 1_ans:%d\n",ans);
		}
		// cout<<"ans1:"<<ans<<endl;

		for(int i=rem; i<n; i++){
			// printf("irem:%d, ans:%d, cost[%d]:%d, avg:%d",i,ans,i,cost[i],avg);

			ans += abs(cost[i] - avg);

			// printf(", 2_ans:%d\n",ans);
		}

		// cout<<"ans2:"<<ans<<endl;

		printf("$%.2f\n", ans/200.0);
	}
	return 0;
}