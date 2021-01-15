#include <iostream>
#include <cstring> //要用 strlen()
using namespace std;

int main(){
	
	char str[100][101];
	int len[100], n=0, max=0;

	//開一個 100*101 和 100 的陣列
	for(int i=0; i<100; i++){
		for(int j=0; j<101; j++){
			str[i][j] = 0;
		}
		len[i] = 0;
	}

	//吃測資進來
	while(cin.getline(str[n], 101)){
		len[n] = strlen(str[n]); //找每一筆的長度
		
		if(len[n]>max) max = len[n]; //調整最大長度

		for(int add = len[n]; add < max; add++){
			str[n][add] = ' ';
			len[n]++;
		}
		n++;

	}

	//旋轉陣列
	//第一圈是每一行的長度，用最長的那個
	//第二圈是有多少行，從最後一行開始
	for(int j=0; j<max; j++){
		for(int i=n-1; i>=0; i--){
			//
			if(j<len[i]) cout << str[i][j];
		}
		cout << endl;
	}
	return 0;

}