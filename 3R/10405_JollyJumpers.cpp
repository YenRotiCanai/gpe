#include <iostream>
#include <set>
#include <cstdlib>

using namespace std;

int main(){
    int n;
    while(cin >> n){
        int a; cin >> a;
        set<int> jset;
        for(int i=1; i<n; i++){
            int b; cin >> b;
            int d = abs(a-b);
            if(d && d<n) jset.insert(d);
            a = b;
        }
        if(jset.size() == n-1) cout << "Jolly";
        else cout << "Not jolly";
        cout << endl;
    }
    return 0;
}