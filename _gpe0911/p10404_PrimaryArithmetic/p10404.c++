#include<iostream>
using namespace std;

int divide(int n, int arr[], int &cnt){ //&cnt 的 & 是取該記憶體位置的意思
	for(cnt = 0; n!=0; cnt++){

		// cout << "n:" << n << endl;

		arr[cnt] = n%10; //用 mod 取餘數的方式來得到到一個數字，然後存進陣列
		n/=10; //把最後一個數字拿掉

		// cout << "cnt:" << cnt << " , arr[cnt]:" << arr[cnt] << " ,n:" << n << "\n"<< endl;

	}
	return 0; //書上沒有要寫這個，可是不寫好像會出錯
}

int main(){
	int a, b;
	while(cin >> a >> b && (a!=0 || b!=0)){
		int lenA, lenB;
		int arrA[11] = {}, arrB[11] = {};
		int sum[12] = {};
		divide(a, arrA, lenA); //lenA？
		divide(b, arrB, lenB);

		int lenM = max(lenA,lenB); //找他們兩個最長的出來，後續在算的時候只要 lenM-1 次就好，可以節省計算的次數
		int ans = 0;
		for(int i=0; i<lenM; ++i){ //在 for 裡面 i++ 和 ++i 都是一樣的意思
			// cout << "i:" << i << ", ans1:" << ans << endl;
			sum[i] += (arrA[i]+arrB[i]);
			if(sum[i]>=10){
				// cout << "true " << sum[i] << endl;
				sum[i]-=10;
				sum[i+1]++;
				++ans;
			}
			// cout << "ans2:" << ans << endl;
		}
		if(ans == 0) cout << "No carry operation.\n";
		else if(ans == 1) cout << "1 carry operation.\n";
		else cout << ans << " carry operations.\n";
	}
	return 0;
}