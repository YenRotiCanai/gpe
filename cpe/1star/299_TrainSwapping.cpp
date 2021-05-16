#include <iostream>

using namespace std;

int main(){
    int cases;
    cin >> cases;
    while(cases--){
        int n;
        cin >> n;

        int arr[n];
        
        for(int i=0; i<n; i++){
            cin >> arr[i];
        }

        int count = 0;
        bool sorted = true;

        while(sorted){
            sorted = false;
            
            //注意！這邊的迴圈只跑到 n-1，不能到 n
            for(int i=0; i < n-1; i++){

                //cout << "i:" << i << ", arr[i]:" << arr[i] << ", arr[i+1]:" << arr[i+1] << endl;

                if(arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    sorted = true;
                    count ++;
                    //cout << "c:" << count << endl;
                }
            }
        }

        cout << "Optimal train swapping takes " << count << " swaps." << endl;
    }
}