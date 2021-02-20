#include <iostream>

using namespace std;

int main(){
    int n, a, b;
    int cases = 1;
    cin >> n;
    while(n--){
        cin >> a >> b;
        int ans=0;
        for(int i=a; i<=b; i++){
            if(i%2!=0) ans += i;
        }
        cout << "Case " << cases << ": " << ans << endl;
        cases++;
    }
    return 0;
}