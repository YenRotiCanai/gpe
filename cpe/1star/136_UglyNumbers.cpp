//背
//https://yuihuang.com/zj-d129/
//https://knightzone.studio/2012/03/14/1468/uva%EF%BC%9A136%EF%BC%8Dugly-numbers/
#include<iostream>
#include<algorithm>
using namespace std;

int arr[1505];

int main(){
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 3;
    arr[4] = 4;
    arr[5] = 5;

    for(int i=6; i<=1500; i++){
        int idx1 = 1;
        while(arr[idx1] * 2 <= arr[i-1]) idx1++;

        int idx2 = 1;
        while(arr[idx2] * 3 <= arr[i-1]) idx2++;

        int idx3 = 1;
        while(arr[idx3] * 5 <= arr[i-1]) idx3++;

        arr[i] = min({arr[idx1] * 2, arr[idx2] * 3, arr[idx3] * 5});
    }
    cout << "The 1500'th ugly number is " << arr[1500] << ".\n";  //859963392

    return 0;
}