#include <iostream>
using namespace std;

int main(){
	char week[7][10] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; //存放星期的名字
	int month_days[] = {31,28,31,30,31,30,31,31,30,31,30,31}; //每一個月的天數
	int n; //測資數量
	cin >> n;

	while(n--){
		int month, day;
		cin >> month >> day;

		int w = 5; //第一個測資是1月6號禮拜四，回推回到去年的12月31號就是禮拜五
		for(int i=1; i<month; i++){ //從1開始一直到那個月份
			w+=month_days[i-1]; //把每一個月份的天數加上去，eg：4月的話，就是1月+2月+3月+w
		}
		w=(w+day)%7; //上面算出月份，這裏加上當月的日期，然後mod一下，就得出今天禮拜幾

		cout << week[w] << endl;
	}
	return 0;
}