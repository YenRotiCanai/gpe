/*
1. 把測資當字串吃進來，然後用 stringstream 來分割，並把它 push 進 vector
2. 宣告一個 stack，從尾巴開始讀 vector 裡面的值，只要不是運算字，就把他 push 進 stack 裡面
3. 如果遇到運算子，把 stack 最上面的兩個值拿出來，做完運算之後再放回去
4. 最後輸出 stack 裡面最後一個也就是最上面一個，就是答案

注意：
1. string 轉 int 不能用 stoi，gpe的好像不是 c++11，所以用 stringstream 轉。
2. vector 可以像一般 array 那樣存取。
3. 拿 stack 的值時，是先拿 top 值，再 pop 掉。
4. 用 stack 的 size 判斷這筆測資是不是合法。如果多一個運算子，那就會出現沒有多餘的測資給他算，就代表不合法。
*/
#include <iostream>
#include <cmath>
#include <stack>
#include <cstring>
#include <sstream>
#include <vector>
using namespace std;

int main(){
    
    string str;
    string str2;
    int value;
    
    while(getline(cin, str) && str!="."){
        vector<string> vt;
        stringstream ss(str);
        bool illegal = false;

        while(getline(ss, str2, ' ')){
            vt.push_back(str2);
        }

        stack<int> st;

        for(int i=vt.size()-1; !illegal && i>=0; i--){

            if(vt[i]!="+" && vt[i]!="-" && vt[i]!="*" && vt[i]!="/" && vt[i]!="%"){
                stringstream si(vt[i]);
                si >> value;
                st.push(value);
            }else{

                if(st.size()<2){
                    illegal = true;
                    break;
                }

                int op1 = st.top();
                st.pop();
                int op2 = st.top();
                st.pop();

                if(vt[i] == "+") st.push(op1 + op2);
                else if(vt[i] == "-") st.push(op1 - op2);
                else if(vt[i] == "*") st.push(op1 * op2);
                else if(vt[i] == "/") st.push(op1 / op2);
                else if(vt[i] == "%") st.push(op1 % op2);
            }
        }

        if(illegal) cout << "illegal" << endl;
        else cout << st.top() << endl;

    }
    return 0;
}