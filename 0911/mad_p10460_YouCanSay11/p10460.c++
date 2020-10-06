//java 直接用 BigInteger 比較方便 XD
#include<iostream>
#include<string>

using namespace std;
int main(){
	string s;
	while(cin >> s && s!="0"){
		long long sum[2] = {0,0};
		for(int i=0; i<s.length(); i++){

			cout << sum[i] << endl;

			sum[i%2] += s[i] - '0';
		}
		cout << s << " is" << ((sum[0]-sum[1])%11?" not":"");
		cout << " a multiple of 11." << endl;
	}
}