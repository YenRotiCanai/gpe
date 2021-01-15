#include <iostream>
#include <cctype> //有改變大小寫的func
using namespace std;

int cT[150], len;

int main(){
	
	char c;
	int n;
	cin >> n;
	cin.ignore(); //cin 後面會留一個換行，所以一定要吃掉他，不然下一行會直接不見

	while(n--){
		string s;
		getline(cin, s); //吃一整行
		for(int i=0; i<s.length(); i++){
			c = toupper(s[i]); //這裏toupper是把他包起來再轉，和java的用法有點不一樣
			cT[c]++;
			len++;
		}
	}

	//要記得用 --len
	//輸出的時候，因為已經在for裡面宣告 c 是 字母了，所以不用特別轉成 char
	while(--len){
		for(c='A'; c<='Z'; c++){
			if(cT[c] == len) cout << c << " " << len << endl;
		}
	}
}