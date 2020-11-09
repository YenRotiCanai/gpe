#include <iostream>
#include <map>
#include <set>
using namespace std;

int main(){
	int n;
	while(cin >> n, n){
		map<set<int>,int> count;
		int M = 0, MC = 0;
		while(n--){
			set<int> suit;
			for(int m=0; m<5; m++){
				int course;
				cin >> course;
				suit.insert(course);
			}
			count[suit]++;
			int h = count[suit];
			if(h==M) MC++;
			if(h>M) M=h, MC=1;
		}
		cout << M*MC << endl;
	}
}