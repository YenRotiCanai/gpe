#include <iostream>

using namespace std;

int main(){
	int n;
	cin >> n;
	string f;
	getline(cin, f);
	while(n--){

		getline(cin, f);
		cout << n << endl;
	}
}