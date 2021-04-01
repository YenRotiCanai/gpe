#include <iostream>
#include <stack>
using namespace std;
int main(){
    int n;
    stack<int> stk;

    while(cin>>n && n){
        int parity = 0; //要加起來的
        while(n){
            parity += n%2;
            stk.push(n%2); //把結果算好後，推進stack
            n/=2;
        }

        cout << "The parity of ";
        while(stk.size()){
            cout << stk.top(); //從 stack 的上面開始叫
            stk.pop(); //每叫完一個就丟掉一個
        }
        cout << " is "<< parity << " (mod 2)." << endl;
    }

    return 0;
}