//https://sites.google.com/site/zsgititit/home/jin-jiec-cheng-shi-she-ji/acm---10191---longest-nap
#include <iostream>
#include <string>
#include <cstring>
#include <cstdio>

using namespace std;

int main(){
	
	int n, hs, ms, he, me, ts, te, time[481], maxt, tcount, maxs, count = 1;
	int hmax, mmax;
	string s;
	while(cin >> n){
		getline(cin, s);
		memset(time, 0, sizeof(time));
		time[480] = 1;
		maxt = 0;
		maxs = 0;

		for(int i=0; i<n; i++){
			getline(cin, s);
			//把時間抓出來
			hs = (s[0]-'0')*10 + s[1]-'0';
			ms = (s[3]-'0')*10 + s[4]-'0';
			he = (s[6]-'0')*10 + s[7]-'0';
			me = (s[9]-'0')*10 + s[10]-'0';

			//起始時間和結束時間
			ts = hs*60+ms-600;
			te = he*60+me-600;

			//標記上班時間
			for(int j = ts; j<te; j++) time[j] = 1;
		}

		if(time[0] == 0) tcount = 1;
		else tcount = 0;

		//統計可以睡的時間，有三個狀況
		//1. 如果上一個和現在這個都沒工作的話，就可以睡
		//2. 如果上一個要做工，現在不用，就重新算 tcount
		//3. 如果上一個不用，而現在要，就統計看是不是可以睡最久的時間
		for(int i=1; i<481; i++){
			if((time[i-1]==0) && (time[i]==0)) tcount++;
			if((time[i-1]==1) && (time[i]==0)) tcount=1;
			if((time[i-1]==0) && (time[i]==1)){
				if(maxt < tcount){
					maxt = tcount;
					maxs = i - maxt;
				}
			}
		}

		hmax = (maxs + 600) / 60;
		mmax = (maxs + 600) % 60;

		if(mmax < 10) printf("Day #%d: the longest nap starts at %d:0%d", count, hmax, mmax);
		else printf("Day #%d: the longest nap starts at %d:%d", count, hmax, mmax);

		if(maxt < 60) printf(" and will last for %d minutes.\n", maxt);
		else printf(" and will last for %d hours and %d minutes.\n", maxt/60, maxt%60);

		count++;
	}
}