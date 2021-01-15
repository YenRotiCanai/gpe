//要用 long 才可以，如果用 int 會 TLE
#include <iostream>
#include <cstring>

using namespace std;

long add(long a){
	long len = 1;
	while(a!=1){
		if(a%2!=0) a = 3 * a + 1;
		else a /= 2;
		len++;
	}

	return len;
}

int main(){
	long a, b;
	while(cin >> a >> b){

		cout << a << " " << b << " ";
		
		if(a > b){
			long tmp = a;
			a = b;
			b = tmp;
		}

		long maxLen = 0;
		for(long i=a; i<=b; i++){
			maxLen = max(maxLen, add(i));
		}
		cout << maxLen << endl;
	}
}