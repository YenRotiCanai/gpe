#include <iostream>
#include <stack>
using namespace std;

int main(){
    unsigned int n;
    stack<int> st;

    while(cin >> n && n!=-1){
        if(n == 0){
            cout << 0 << endl;
            continue;
        }

        int factor = 1;
        int remainder;
        while(n!=0){
            remainder = n % factor;
            //cout << "rem:" << remainder << endl;
            st.push(remainder);

            n /= factor;
            factor++;
        }

        cout << st.top();
        st.pop();

        while(!st.empty()){
            cout << " " << st.top();
            st.pop();
        }
        cout << endl;
    }
    return 0;
}