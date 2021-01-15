//http://andy10234b.blogspot.com/2016/05/cpe10414bangla-numbers.html
//他原本 output 的那個 function 是用 longlongint，可是因為他沒有 return 東西，所以要用 void，雖然他沒用可是還是可以過，只是在手動執行的時候會出warning

/*
解法:
把每一筆先用最大的來除，如果結果大於 1，就再除，如果還可以除，就一直繼續
不然就跑到最後，直接輸出
ex：23764000
1. if(input/kuti) 這裏23764000/10000000 = 2，所以通過，進去再跑一次output
2. 第二次output，這時 2 無論除多少都是小於 1，所以會跳到最後直接輸出 “ 2”
3. 這時候再回去第一次的output，輸出 “ kuti”
4. 這階段為止，答案就有了 “ 2 kuti”
5. 然後這時 input %= kuti，找剩下的，那就是3764000
6. 這時候就到下一個for loop，if(input/lakh)，這裏3764000/100000 = 37，通過，進去再跑output
7. 程式就一直這樣跑下去，全部跑完後，就會跳回主程式了。

*/
#include <iostream>

#define kuti 10000000
#define lakh 100000
#define hajar 1000
#define shata 100

using namespace std;

void output(long long int input){
	
	if(input / kuti){
		output(input/kuti);
		cout << " " << "kuti";
		input %= kuti;
	}
	if(input / lakh){
		output(input/lakh);
		cout << " " << "lakh";
		input %= lakh;
	}
	if(input / hajar){
		output(input/hajar);
		cout << " " << "hajar";
		input %= hajar;
	}
	if(input / shata){
		output(input/shata);
		cout << " " << "shata";
		input %= shata;
	}
	if(input){
		cout << " " << input;
	}
}

int main(){
	long long int input;
	
	int cases = 1;

	while(cin >> input){
		cout << cases << ".";

		output(input);

		cases++;

		cout << endl;
	}
}