#include <stdlib.h>
#include <stdio.h>
 
int f[1001];
 
int main()
{
	// 打表計算，如果數據較大，需要使用篩法
	for (int i = 1; i < 1001; ++ i) {
		f[i] = 0;
		for (int j = 1; j <= i; ++ j) {
			if (i%j == 0) {
				f[i] += j;
			}
		}
	}
	
	int n, cases = 1;
	while (~scanf("%d",&n) && n) {
		int position = -1;
		for (int i = 1000; i > 0; -- i) {
			if (f[i] == n) {
				position = i;
				break;
			}
		}
		
		printf("Case %d: %d\n",cases ++, position);
	}
	 
	return 0;
}