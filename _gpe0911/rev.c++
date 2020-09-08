#include <iostream>
#include <cstdlib>
#include <cstring>
#include <cstdio>

using namespace std;

char maps[100][100];
int smap[100][100];

int main(){
	int N, M, X, Y;
	while(~scanf("%d%d%d", &N, &M, &Y) && Y){
		for(int i=0; i<N; i++){
			scanf("%s",maps[i]);
		}
		memset(smap, 0, sizeof(smap));
		X = 0; Y--;
		int count = 1;

		while(!smap[X][Y] && X >= 0 && X < N && Y >= 0 && Y < M){
			smap[X][Y] = count ++;
			switch(maps[X][Y]){
				case 'N':X--; break;
				case 'S':X++; break;
				case 'E':Y++; break;
				case 'W':Y--; break;
				default:break;
			}
		}

		if(X>=0 && X<N & Y>=0 && Y<M){
			printf("%d step(s) before a loop of %d step(s)\n", smap[X][Y]-1, count-smap[X][Y]);
		}else{
			printf("%d step(s) to exit\n", count-1);
		}
	}
	return 0;
}