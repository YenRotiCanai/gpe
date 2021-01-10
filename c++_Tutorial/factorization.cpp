#include <iostream>
#include <map>
using namespace std;

int main(){

	int n;
	
	while(cin >> n){

		int d = 2;
		map<int, int> num;
		map<int, int>::iterator iter;
		bool F = true;
		
		while(n>1){

			while(n % d == 0){
				n /= d;
				cout << d << " ";

				num[d]++;
			}

			// iter = num.find(d);
			// if(F) cout << " * ";
			// cout << iter->first << "^" << iter->second;
			d++;
		}
		cout << endl;
		cout << "120 = ";
		for(iter = num.begin(); iter!=num.end(); iter++){
			if(!F) cout << " * ";
			cout<<iter->first<<"^"<<iter->second;
			F = false;
		}

		cout << endl;
	}

	return 0;
}