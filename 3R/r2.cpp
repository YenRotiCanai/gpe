#include <iostream>
#include <cstdio>

using namespace std;

int main(){
	int n;
	
	while(cin >> n && n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			if(n%i==0){
				sum += i;
			}
		}
		cout << sum << endl;
	}
}