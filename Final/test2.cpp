#include <iostream>

using namespace std;

void addAndPrint(int a, int b){
    int c = a+b;
    cout << c; 
}

int main(){
    int a, b;
    cin >> a >> b;
    addAndPrint(a,b);
    cout << endl;
}