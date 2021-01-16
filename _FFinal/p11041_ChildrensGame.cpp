//http://programming-study-notes.blogspot.com/2014/02/uva-10905-childrens-game.html

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

bool cmp(string a, string b){
	return(a+b) > (b+a);
}

int main(){
	
	int n;
	while(cin >> n){
		
		if(!n) break;

		vector<string> num;
		string tmp;

		for(int i=0; i<n; i++){
			cin >> tmp;
			num.push_back(tmp);
		}

		sort(num.begin(), num.end(), cmp);

		for(int i=0; i<n; i++){
			cout << num[i];
		}
		cout << endl;
	}
}