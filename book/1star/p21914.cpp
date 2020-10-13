#include <iostream>
#include <cstring>

using namespace std;

int main(){
	char str[100][101];
	int len[100], n=0, max=0;

	//初始化陣列
	for(int i=0; i<100; i++){
		for(int j=0; j<101; j++)
			str[i][j] = 0; //str 紀錄每一個句子
		len[i] = 0; //len 紀錄各句子的長度
	}

	while(cin.getline(str[n],101)){
		len[n] = strlen(str[n]); //取得句子的長度
		if(len[n]>max) max = len[n]; //保持最長的句子長度
		for(int add = len[n]; add<max; add++){
			str[n][add] = ' ';
			len[n]++;
		}
		n++; //總列數
	}
	for(int j=0; j<max; j++){
		for(int i=n-1; i>=0; i--){
			if(j<len[i]) cout<< str[i][j];
		}
		cout << endl;
	}
	return 0;
}