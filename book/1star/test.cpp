#include <iostream>
//#include <cctype>
#include <string>

using namespace std;

int cT[256], len;

int main(){
	int n;
	string s;
	char c;
	cin >> n;
	getline(cin, s); //為了消除cin的緩存
	while(n--){
		getline(cin, s); //把他整串吃進來

		for(int i=0; i<s.length(); i++){
			len++; //總長度++
			c = toupper(s[i]);
			cT[c] ++;
			//cout << s[i] << " len: "<< len << " upper: " << c << endl;
			//cT[toupper(s[i])]++; //把 s 裡面的字變成大寫後，放到對應的陣列格子裡++
		}
	}
	while(--len){
		for(c='A'; c<='Z'; c++){
			if(cT[c]==len)
				cout << c << " " << len << endl;
		}
	}
	return 0;
}