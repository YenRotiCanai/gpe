#include <iostream>

using namespace std;

int main(){
    int k;
    while(cin >> k && k){
        int m = (k*(k+1)*(2*k+1)) / 6;
        cout << m << endl;
    }
}