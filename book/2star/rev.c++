#include <iostream>
using namespace std;
int main(){
	unsigned short int n;
	while(cin >> n){
		unsigned short int rd = 1; //先設 餘數=1
		unsigned short int ans = 1;
		while(rd%n){
			ans++;
			rd = (rd*10+1)%n; //rd*10+1 變成新的後，再mod一次把他變小
		}
		cout << ans << "\n";
	}
	return 0;
}