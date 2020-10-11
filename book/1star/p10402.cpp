//統計全部字母出現過的次數，然後按照次數由多到少印出來，如果有次數一樣的就按照字母的大小排序。

#include <iostream>
#include <string>

using namespace std;

int cT[256], len;

int main(){
	int n;
	string s;
	char c;
	cin >> n;
	getline(cin, s);

	while(n--){
		getline(cin, s);
		for(int i=0; i<s.length(); i++){
			c = toupper(s[i]);
			cT[c]++;
			len++;
		}
	}
	while(--len){
		for(c='A'; c<='Z'; c++){
			if(cT[c] == len){
				cout << c << " " << len << endl;
			}
		}
	}
}