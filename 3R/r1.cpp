#include <iostream>
#include <map>

using namespace std;

int main(){

	map<string, int> country;
	map<string, int>::iterator iter;
	
	int cases;

	string str;
	char others[76];
	
	cin >> cases;
	cin.ignore();

	while(cases--){
		cin >> str;
		country[str]++;
		
		cin.getline(others, 76);
	}

	for(iter = country.begin(); iter != country.end(); iter++){
		cout << iter->first << " ";
		cout << iter->second << endl;
	}

}