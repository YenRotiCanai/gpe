#include<iostream>

using namespace std;

int main(){
    int n;
    int set = 1;
    while(cin >> n && n){
        int arr[n];
        int total = 0;
        for(int i=0; i<n; i++){
            cin >> arr[i];
            total += arr[i];
        }

        int avg = total / n;

        int moves = 0;

        for(int i=0; i<n; i++){
            if(arr[i] > avg) moves += arr[i] - avg;
        }

        cout << "Set #" << set << endl;
        cout << "The minimum number of moves is " << moves << "." << endl;
        cout << endl;

        set++;
    }
}