#include <iostream>
#include <map>

using namespace std;

int main(){
	map<string, int> count;
	map<string, int>::iterator iter;

	string first_s;
	char others[76] = {0};
	int n;

	cin >> n;
	cin.ignore(); //吃掉換行

	while(n--){
		cin >> first_s; //吃第一個字（國家名字）
		count[first_s] ++; //直接把他放到對應的位子，然後在那位置+1
		cin.getline(others, 76); //吃其他的（人名）
	}

	//按 map 裡面的排序直接輸出，map會自動依照字母來排序
	for(iter = count.begin(); iter != count.end(); iter++){
		cout << iter->first << " ";
		cout << iter->second << endl;
	}

	return 0;
}