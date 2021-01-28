#include <iostream>
#include <string>

using namespace std;

int cT[300], len;

int main(){
    int n;
    string s;
    char c;
    cin >> n;
    getline(cin, s); //吃掉換行

    while(n--){
        getline(cin, s);
        for(int i=0; i<s.length(); i++){
            c = toupper(s[i]); //把裡面每一個字元變成大寫
            cT[c]++; //在對應的位置把他的數量 +1
            len++; //總長度+1
        }
    }

    while(--len){
        for(c='A'; c<='Z'; c++){
            if(cT[c] == len)
            cout << c << " " << len << endl;
        }
    }
}