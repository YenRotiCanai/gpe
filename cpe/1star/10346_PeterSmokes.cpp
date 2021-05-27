#include <iostream>

using namespace std;

int main(){
    int n, k;
    while(cin >> n >> k){
        int ans = n;
        int change = 1;
        while(change){
            change = n / k;
            int left = n % k;
            ans += change;
            n = change + left;
        }
        cout << ans << endl;
    }
}