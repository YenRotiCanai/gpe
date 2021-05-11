#include <iostream>
#include <cstdio>
#include <cstring>

using namespace std;

bool isVowel(char c){
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

int main(){
    int n;
    cin >> n;
    cin.ignore();
    while(n--){
        string a, b;
        getline(cin, a);
        getline(cin, b);

        if(a.length() != b.length()){
            cout << "No" << endl;
            continue;
        }

        bool isSame = true;
        for(int i=0; i < a.length(); i++){
            if(a[i] != b[i] && (!isVowel(a[i]) || !isVowel(b[i]))){
                isSame = false;
                break;
            }
        }

        printf("%s\n", isSame? "Yes":"No");

    }
    return 0;
}