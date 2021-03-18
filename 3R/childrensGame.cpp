#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

//宣告一個用來比較的function
bool cmp(string a, string b){
    return (a+b) > (b+a);
}

int main(){
    int n;
    while(cin >> n && n){
        vector<string> vt; //用一個 vector 來存測資
        string str;
        //把測資讀進來，然後放到 vector 裡面
        for(int i=0; i<n; i++){
            cin >> str;
            vt.push_back(str);
        }
        //排序vector裡面的東西
        sort(vt.begin(), vt.end(), cmp);
        //把裡面的東西全部印出來
        for(int i=0; i<n; i++){
            cout << vt[i];
        }
        cout << endl;
    }
}