#include <iostream>

using namespace std;

int count_3n(long n){
	long count = 1;

	while(n != 1){
		if(n % 2 == 0) n/=2;
		else n = 3*n + 1;

		count++;
	}

	return count;
}

int main(){
	long a, b;
	

	while(cin >> a >> b){
		int max_count = 0;

		cout << a << " " << b << " ";

		if(a > b){
			long tmp = a;
			a = b;
			b = tmp;
		}

		for(long i = a; i <= b; i++){
			max_count = max(count_3n(i), max_count);
		}

		cout << max_count << endl;
	}
}