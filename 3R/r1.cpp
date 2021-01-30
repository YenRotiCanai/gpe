#include <iostream>

using namespace std;

int main(){
	string s1, s2;
	
	while(cin >> s1 >> s2){

		char c1[150], c2[150];
		char curr;

		for(int i=0; i<s1.length(); i++){
			curr = s1[i];
			cout << s1[i] << endl;
			cout <<"curr:"<< curr << endl;
			c1[curr]++;
		}
		for(int i=0; i<s2.length(); i++){
			curr = s2[i];
			c2[curr]++;
		}

		for(char c='a'; c<='z'; c++){
			cout << c1[c] << " ";
		}
		cout << endl;

		// for(char c='a'; c<='z'; c++){
		// 	for(int k=1; k<=min(c1[c], c2[c]); k++){
		// 		cout << c;
		// 	}
		// }
		cout << endl;
	}
}