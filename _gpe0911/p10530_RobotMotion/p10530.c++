#include <iostream>
#include <cstdlib>
#include <cstring>
#include <cstdio>

using namespace std;

char maps[100][100];
int smap[100][100];

int main(){
	int N, M, X, Y;
	while(~scanf("%d%d%d", &N, &M, &Y) && Y){ //~這東西是判斷 EOF 的
		for(int i=0; i<N; i++){
			scanf("%s", maps[i]);
		}

		memset(smap, 0, sizeof(smap)); //初始化smap，把裡面全部填上 0
		X = 0; //因為都是從第一行開始，所以 X=0 
		Y--; //陣列裡的Y是從 0 開始，所以 Y 會先退後一個
		int count = 1;

		// cout<<"Start! X:"<<X<<", Y:"<<Y<<endl;
		//當他們在範圍內時( 沒走過的 && X 和 Y 都大於 0 && 小於 N 和 M )
		//！smap[X][Y] -> !1 -> 0，如果是 1(true) 就代表已經走過了，那樣會有死循環；所以要判斷他是 0(false) 的時候才可以讓他繼續走
		while(!smap[X][Y] && X >= 0 && X < N && Y >= 0 && Y < M){
			smap[X][Y] = count ++; //記錄他走到第幾步
			switch(maps[X][Y]){
				case 'N':X--; break;
				case 'S':X++; break;
				case 'W':Y--; break;
				case 'E':Y++; break;
				default :break;
			}
			// cout<<"Moving...X:"<<X<<", Y:"<<Y<<", count:"<<count<<endl;
		}

		// cout<<"smap[X][Y]:"<<smap[X][Y]<<", count:"<<count<<endl;

		//如果他們還在裡面的話(遇到死循環也就是走過的)
		//因為他是遇到走過的點(假設是p)時跳出來，所以就拿p當下的步數，作為step before，然後那最後的步數 - p 就找到他開始死循環的步數也就是 loop of step
		if(X >= 0 && X < N && Y >= 0 && Y < M){
			printf("%d step(s) before a loop of %d step(s)\n", smap[X][Y]-1, count-smap[X][Y]);
		}else{
			printf("%d step(s) to exit\n", count-1);
		}
	}
	return 0;
}