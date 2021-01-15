#include <iostream>
#include <cstring> //要用 strlen()
using namespace std;

int main(){
	
	int a = 5;
	int b = 10;
	for(int i = a; i<b; i++){
		cout << i << " " << a << endl;
		a+=2;
	}

	return 0;

}