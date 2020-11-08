#include <iostream>
#include <string>
#include <map>
using namespace std;

int main(){
    int T, first=1;
    cin >> T;

    while(T--){
        int m, n;
        cin >> m >> n;
        
        map<char, char> parent;
        string city1, city2;
        for(int i=0; i<m; i++){
            cin >> city1 >> city2;
            parent[city2[0]] = city1[0];
        }

        if(first==1) first=0;
        else cout << endl;

        for(int q=0; q<n; q++){
            cin >> city1 >> city2;
            char route1[26], route2[26];
        }
    }
}