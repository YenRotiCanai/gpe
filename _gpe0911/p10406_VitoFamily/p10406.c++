#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
vector<int> num;	//宣告一個 vector 叫做 num

int main(){
	int n,r,s;	//宣告三個分別是 cases、鄰居數量、門牌
	cin >> n;	//輸入 cases 數量

	while(n--){
		cin >> r;	//輸入鄰居數量
		num.clear();	//先清空 vector，避免上一筆的資料殘留

		for(int i=0; i<r; i++){
			cin >> s;	//輸入鄰居門牌
			num.push_back(s);	//vector 的寫入是用 push_back() 這東西，和 array 的不一樣
		}

		sort(num.begin(), num.end());	//從頭排序
		int mid = num[r/2];	//找中位數
		int sum = 0;

		for(int i=0; i<r; i++){
			sum += abs(num[i]-mid);
		}

		cout << sum << endl;	//輸出最終答案
	}
	return 0;
}