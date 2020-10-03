#include <iostream>
#include <map>
using namespace std;

int main(){
	map<string,int> count;
	map<string,int> ::iterator iter;
	string first_s;
	char others[76]={0};
	int n;
	cin >> n;
	cin.ignore(); //cin 後面會吃到 \n，所以用 ignore() 來清掉他
	while(n--){
		cin >> first_s;
		count[first_s]++; //把 string 作為 key，然後在他那邊++
		cin.getline(others,76); //剩下的就不重要，放在others裡面，76是others的size
	}

	//用 iterator 來排序
	for(iter = count.begin(); iter != count.end(); iter++){
		cout << iter -> first << " ";
		cout << iter -> second << endl;
	}
	return 0;
}