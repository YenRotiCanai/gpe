#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;

int main(){
    int M = 9;
    int b = M-1;

    int topb = b;
    while(topb--) cout <<" ";
    cout <<"/\\"<<endl;

    for(int i=2; i<=M-1; i++){
        b--;
        int medb = b;
        while(medb--) cout <<" ";

        int spaces = 2*(i-1);
        cout << "/";
        while(spaces--) cout << " ";
        cout << "\\" << endl;
    }

    cout << "/";
    int underscores = 2*(M-1);
    while(underscores--) cout <<"-";
    cout << "\\" << endl;
}