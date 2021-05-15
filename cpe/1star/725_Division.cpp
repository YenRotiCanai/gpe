#include <iostream>
#include <cstdlib>
#include <iomanip>
using namespace std;

//找出兩個整數裡面有沒有重複的數字
bool isNonRepeat(int a, int b){
    int n[10];
    if(a < 10000 && b < 10000) return false;

    for(int i=0; i<10; i++) n[i] = 0;

    if(a < 10000 || b < 10000) n[0] = 1;

    while(a>0){
        if(n[a%10] == 1) return false;
        else n[a%10] = 1;
        a /= 10;
    }

    while(b>0){
        if(n[b%10] == 1) return false;
        else n[b%10] = 1;
        b /= 10;
    }
    return true;
}

int main(){
    int c;
    bool first = true;
    bool ans;

    while(cin >> c){
        if(c==0) break;
        if(!first) cout << endl;
        first = false;
        ans = false;

        for(int i=1234; i<=98765; i++){
            int a = c * i;
            
            if(a>99999) continue;
            else{
                if(isNonRepeat(a, i)){
                    ans = true;
                    cout << setw(5) << setfill('0') << a;
                    cout << " / ";
                    cout << setw(5) << setfill('0') << i;
                    cout << " = " << c << endl;
                }
            }
        }
        if(!ans) cout << "There are no solutions for " << c << "." << endl;
    }
    return 0;
}