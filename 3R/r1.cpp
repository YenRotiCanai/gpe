#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int> vt;
    
    int cases;
    
    while(cin >> cases && cases){
        vt.clear();
        vt.push_back(cases);
        
        int n;
        while(cin >> n && n){
            vt.push_back(n);
        }

        cout << vt.size() << endl;
    }
}