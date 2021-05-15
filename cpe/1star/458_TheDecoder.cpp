//不知道為什麼用 java 會 WA，用c++就沒事
#include <iostream>
#include <cstring>
#include <cstdio>
using namespace std;

int main(){
    string str;
    while(getline(cin, str)){
        for(int i=0; i<str.length(); i++){
            str[i] = str[i] - 7;
            cout << str[i];
        }
        cout << endl;
    }
    return 0;
}