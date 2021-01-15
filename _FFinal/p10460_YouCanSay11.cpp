//找奇數位和偶數位的sum，相減後mod 11，如果是11的倍數（mod 11 == 0）就是 Yes

#include <iostream>
#include <cstring>

using namespace std;

int main(){
	string s; // 用字串的方式吃進來
	while(cin >> s && s!="0"){
		long long sum[2] = {0,0}; //開兩個位子來記錄奇數和偶數，基本上就是 0 和 1

		for(int i=0; i<s.length(); i++){
			sum[i%2] += s[i]-'0'; //如果 i%2==0，就會被放在偶數位加總
		}

		cout << s << " is" << ((sum[0] - sum[1])%11? " not":"");
		cout << " a multiple of 11." << endl;
	}
}