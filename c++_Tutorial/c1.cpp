#include <iostream>
using namespace std;

int calc(int x){
	int count = 1;

	while(x != 1){
		if(x % 2 == 0) x /= 2;
		else x = x * 3 + 1;
		count ++;
	}
	return count;
}

int main(){

	int n, m, c, max=0;
	
	while(cin >> n >> m){

		cout << n << " " << m;

		if(n>m){
			int tmp  = n;
			n = m;
			m = tmp;
		}

		for(int i=n; i<=m; i++){
			c = calc(i);
			if(c > max) max = c;
		}

		cout << " " << max << endl;

	}

	return 0;
}