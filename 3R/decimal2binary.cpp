#include <iostream>
using namespace std;
int main(){
    int n;
    int arr[20];
    while(cin >> n){
        
        int i;
        for(i=0; n>0; i++){
            arr[i] = n%2;
            n/=2;
        }

        for(i=i-1; i>=0; i--){
            cout << arr[i];
        }
        cout << endl;

    }
    return 0;
}