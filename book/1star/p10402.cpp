#include <iostream>
#include <cctype> //用來分類或轉換字元的header
using namespace std;

int counT[256],len;

int main(){
	int n;
	char c;
	cin >> n;
	while(n--){
		while(cin >> c){
			len++;
			counT[toupper(c)]++; //每吃一個字元進來，就把len+1，然後變成大寫後在count[]裡面對應+1
			}
		while(--len){
			cout << len << endl;
			for(c='A'; c<='Z';c++){
				if(counT[c]==len)
					cout<< c << " " << counT[c] << endl;
			}
		}
	}
	
	return 0;
}