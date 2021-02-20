#include <iostream>
#include <set>

using namespace std;

int main(){
    int n;
    
    while(cin >> n){
        set<int> jset;
        int a, b;
        cin >> a;
        for(int i=0; i<n-1; i++){
            cin >> b;
            int d = abs(a-b);
            if(d && d<n) jset.insert(d);
            a = b;
        }
        if(jset.size()==n-1) cout << "Jolly";
        else cout << "Not Jolly";
        cout << endl;

    }
    return 0;
}