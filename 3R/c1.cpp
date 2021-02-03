#include <iostream>
#include <cmath>
using namespace std;

int main(){
    long n;
	while(cin >> n && n!=0){
        long m = (long)sqrt(n);
        cout << (m*m==n? "yes":"no") << endl;
    }
}