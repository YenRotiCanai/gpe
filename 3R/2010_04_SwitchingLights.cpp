//看看 sqrt後 和之前的是不是一樣
#include <iostream>
#include <cmath>

using namespace std;

int main(){
    int cases;
    cin >> cases;

    while(cases--){
        long m, n;
        cin >> m;
        n = (long)sqrt(m);

        cout << (n*n==m? "yes":"no") << endl;
    }

}