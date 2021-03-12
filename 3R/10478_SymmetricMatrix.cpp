#include <iostream>

using namespace std;

int main(){
    int cases;
    cin >> cases;
    for(int i=1; i<=cases; i++){
        int n;
        char other;
        cin >> other >> other >> n;

        int N = n*n;
        int arr[N];
        bool sys = true;
        for(int i=0; i<N; i++){
            cin >> arr[i];
        }
        for(int i=0; i<N/2; i++){
            //cout << arr[i] << " " << arr[N-1-i] << endl;
            if(arr[i]!=arr[N-1-i]){
                sys = false;
                break;
            }
        }
        cout << "Test #" << i << ": "; 
        if(sys) cout << "Symmetric." << endl;
        else cout <<"Non-symmetric." << endl;
    }
}