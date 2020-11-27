#include <iostream>
#include <cstring> //需要 strlen() 去取得句子的長度
using namespace std;

int main(){
	char str[100][101]; //記錄句子
	int len[100]; //記錄長度
	int n=0, max=0;

	//初始化陣列
	for(int i=0; i<100; i++){
		for(int j=0; j<101; j++){
			str[i][j] = 0;
		}
		len[i] = 0;
	}

	//讀測資
	while(cin.getline(str[n],101)){ //直接放入 str 裡面
		len[n] = strlen(str[n]); //把他的長度給len

		//比較是否為最長
		if(len[n] > max) max = len[n];

		//補空格
		//這裡會從該行的最後一個位置開始補，一直補到 max
		for(int add=len[n]; add<max; add++){
			str[n][add] = ' ';
			len[n]++;
		}
		n++; //總列數++
	}

	//模擬旋轉後的順序輸出
	//從最後一行的第一個字開始，之後每輸出一個就換一行
	for(int j=0; j<max; j++){
		for(int i=n-1; i>=0; i--){
			if(j<len[i]){ //避免輸出多餘的空格
				cout << str[i][j];
			}
			cout << endl;
		}
	}
}