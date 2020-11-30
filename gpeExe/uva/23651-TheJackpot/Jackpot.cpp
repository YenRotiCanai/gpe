//https://knightzone.studio/2014/12/23/2433/uva%EF%BC%9A10684%EF%BC%8Dthe-jackpot/

#include <iostream>
#include <cstdio>

using namespace std;

int main(){
	int N;
	while(scanf("%d", &N) != EOF && N!=0){
		int seq[10005];

		for(int i=1; i<=N; i++){
			scanf("%d", &seq[i]);
		}

		int dp[10005] = {0};
		int win = 0;

		for(int i=1; i<=N; i++){
			dp[i] = max(seq[i], dp[i-1]+seq[i]);
			win = max(win, dp[i]);
		}

		if(win > 0){
			printf("The maximum winning streak is %d.\n", win);
		}else printf("Losing streak.\n");
	}
	return 0;
}