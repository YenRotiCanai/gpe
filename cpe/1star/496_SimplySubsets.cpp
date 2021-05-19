//https://yuihuang.com/zj-d691/
//(Line 22~30) 找出集合 A 和 B 的交集元素，置於另一集合 st。同時把這些交集元素從集合 A 和 B 中移除。

#include <iostream>
#include <set>
#include <sstream>
using namespace std;

int main(){
    string s;
    stringstream ss;

    while(getline(cin, s)){
        set <string> A, B, st;
        ss.clear();
        ss.str(s);
        while(ss >> s) A.insert(s);

        getline(cin, s);
        ss.clear();
        ss.str(s);
        while(ss >> s) B.insert(s);

        for(auto i:A){
            if(B.count(i)){
                st.insert(i);
                B.erase(i);
            }
        }

        for(auto i:st) A.erase(i);

        if(A.empty() && B.empty()) cout << "A equals B" << endl;
        else if(A.empty()) cout << "A is a proper subset of B" << endl;
        else if(B.empty()) cout << "B is a proper subset of A" << endl;
        else{
            if(st.empty()) cout << "A and B are disjoint" << endl;
            else cout << "I'm confused!\n";
        }
    }
}