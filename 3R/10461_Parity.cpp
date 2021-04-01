//10 進制轉 2 進制就是一直取 2 的餘數，算出來不是 1 就是 0
//最後再把它們倒過來就 ok 了
#include <iostream>
#include <stack>
using namespace std;
int main(){
    int n;
    stack<int> stk;

    while(cin>>n && n){
        int parity = 0; //存放答案
        while(n){
            parity += n%2;
            stk.push(n%2); //把轉好的 2 進制號碼放進 stack
            n/=2;
        }

        cout << "The parity of ";

        //因為每次取完最上面的那個之後，會把他 pop 出來，所以 size 就會跟著減少，所以把 size 拿來當判斷式
        while(stk.size()){
            cout << stk.top();
            stk.pop();
        }
        cout << " is "<< parity << " (mod 2)." << endl;
    }

    return 0;
}