//會TLE

#include <iostream>
using namespace std;

int main(){
	int a, b;
	while(cin >> a >> b){
		cout << a << " " << b << " ";
		//大小對調
		if(a > b){
			int c = a;
			a = b;
			b = c;
		}

		int maxLen = 0;
		//從小的開始算到大的
		for(int k=a; k<=b; k++){
			int n=k, len=1;
			while(true){
				if(n==1) break;
				if(n%2) n=n*3+1;
				else n/=2;
				len++;
			}
			if(len>maxLen) maxLen = len;
		}
		cout << maxLen << endl;
	}
	return 0;
}