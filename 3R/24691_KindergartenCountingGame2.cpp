#include <iostream>
#include <cstring>

using namespace std;

int main(){
    string str;
    while(getline(cin, str)){
        int n = 0;
        bool word = false;
        for(int i=0; i<str.size(); i++){
            if((str[i] >= 'a' && str[i] <='z') || str[i]>='A' && str[i]<='Z') word = true;
            else if(word){
                word = false;
                n++;
            }
        }

        if(word) n++;

        cout << n << endl;
    }
}