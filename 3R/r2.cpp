#include <iostream>
#include <map>

using namespace std;

int main(){
	map<string, int> country;
	map<string, int>::iterator iter;

	int cases;
	cin >> cases;
	cin.ignore();

	string str;
	char others[76];

	while(cases--){
		cin >> str;
		country[str]++;
		cin.getline(others, 76);
	}

	for(iter = country.begin(); iter!=country.end(); iter++){
		cout << iter->first << " ";
		cout << iter->second << endl;
	}
}