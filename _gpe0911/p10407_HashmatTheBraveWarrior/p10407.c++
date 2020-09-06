#include<iostream>
//#include<cstdlib> //書上說因為要用 abs 所以要加這個，可是經過測試好像沒有加也沒關係，一樣可以用

using namespace std;

int main(){
	long long int a,b;

	while(cin >> a >> b){
		cout<<abs(a-b)<<endl;
	}
	return 0;
}