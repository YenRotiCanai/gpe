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