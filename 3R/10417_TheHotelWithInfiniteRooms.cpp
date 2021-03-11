#include <iostream>

using namespace std;

int main(){
    int s;
    long long d;
    while(cin >> s >> d){
        while(d>0){
            d-=s;
            s++;
        }
        cout << s-1 << endl;
    }
}