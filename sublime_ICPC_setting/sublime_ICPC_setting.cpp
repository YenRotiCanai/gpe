#include <iostream>
using namespace std;

int main(){

#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif

    int n;  
    while(cin >> n && n){
        cout << n << endl;
    }

    return 0;
}