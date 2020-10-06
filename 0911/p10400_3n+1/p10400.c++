#include<iostream>
using namespace std;
int main(){
	int a,b;
	while(cin >> a >> b){
		cout << a << " " << b << " " ;
		
		if(a>b){ //如果 a > b，就把兩個對調，小的給 a，大的給 b
			int c = a;
			a = b;
			b = c;
		}

		int maxLen = 0;
		for(int k=a; k<=b; k++){
			int n=k, len=1;
			while(true){
				if(n==1) break;
				if(n%2) n=n*3+1; //mod2==1 就是奇數，而1代表true
				else n/=2;
				len++;
			}
			maxLen = max(len,maxLen);
		}
		cout << maxLen << endl;
	}
	return 0;
}