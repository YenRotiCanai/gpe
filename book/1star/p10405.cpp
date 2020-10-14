//這是錯的，書本給的是錯的，還沒修

#include <iostream>
#include <set>

using namespace std;

int main(){
	int n;
	while(cin >> n){

		set<int> tank;
		int a; cin >> a;
		for(int i=1; i<n; i++){
			int b; cin >> b;
			int d = (b-a<0?a-b:b-a); //算兩個值相減的絕對值，一開始判斷如果 b-a<0 也就是 -ve 的話，就讓 a-b；不然就是 b-a。這樣就可以得到 +ve 的值
			if(d && d<n) tank.insert(d); //如果 d 在 1 ~ n-1 之間，就把他加到 set 裡面
			a = b; //把第二和第一做交換，然後迴圈會繼續
		}

		if(tank.size()==n-1) cout << "Jolly";
		else cout << "Not Jolly";
		cout << endl;
	}
	return 0;
}