#include <iostream>

using namespace std;

int main(){
    
    char c;
    int first=0;

    while(cin.get(c)){
        if(c!='"') cout << c;
        else if(++first % 2) cout << "``";
        else cout << "''";
    }

    return 0;
}