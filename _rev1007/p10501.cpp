//book
#include <iostream>
using namespace std;

int p[11];
int main(){
	p[0] = 1;
	p[1] = 1;

	for(int i=2; i<=10; i++){
		p[i] = 0;
		for(int j=0; j<i; j++){
			p[i] += p[j]*p[i-j-1];
		}
	}
	int n;
	int dataset = 1;
	while(cin >> n){
		if(dataset > 1) cout << endl;
		cout << p[n] << endl;
		dataset ++;
	}
	return 0;
}

// 0 1
// 1 1
// 2 2
// 3 5
// 4 14
// 5 42
// 6 132
// 7 429
// 8 1430
// 9 4862
// 10 16796