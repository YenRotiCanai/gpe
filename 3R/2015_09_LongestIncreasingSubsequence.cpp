#include <iostream>

using namespace std;

int LIS(int n, int arr[]){
    
    int length[n]; //記錄每一個數字的LIS長度
    for(int i=0; i<n; i++){
        length[i] = 1; //預設每一個的長度都是 1，也就是只有他自己一個
    }

    int L = 0;
    for(int i=0; i<n; i++){
        for(int j=0; j<i; j++){
            if(arr[j]<arr[i]) length[i] = max(length[i],length[j]+1);
        }
        if(L < length[i]) L = length[i];
    }
    
    return L;
}

int main(){
    int n, ans=0;
    while(cin >> n && n){
        int arr[n];
        for(int i=0; i<n; i++){
            cin >> arr[i];
        }
        ans = LIS(n, arr);
        cout << ans << endl;
    }
}