#include <iostream>
#include <cstring>

using namespace std;

int main(){
    string str;
    while(getline(cin, str)){
        int n = 0;
        bool word = false;
        for(int i=0; i<str.size(); i++){
            //如果是字母，就說 word = true
            //如果不是字母，而 word 狀態是 true 的情況下，表示他剛結束一個句子，所以把 word 改成 false，計數器 +1
            if((str[i] >= 'a' && str[i] <='z') || str[i]>='A' && str[i]<='Z') word = true;
            else if(word){
                word = false;
                n++;
            }
        }

        //如果最後沒有標點符號，上面的迴圈就沒辦法把 n+1，所以另外再寫一個
        if(word) n++;

        cout << n << endl;
    }
}