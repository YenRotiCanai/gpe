#include<iostream>
#include<string>
#include<map>

using namespace std;

int main(){
	int m, n;
	cin >> m >> n; //輸入項目數量和cases數量
	map<string,int> hay; //宣告一個叫做 hay 的 map
	string s; //存map的key

	while(m--){
		int p; //存map的value
		cin >> s >> p; //輸入key和value
		hay[s] = p; //把key和value對上
	}

	while(n--){
		int ans = 0;
		while(cin >> s && s!=".") ans += hay[s]; //邊輸入key邊按照map裡面的value加總
		cout << ans << endl;
	}
}