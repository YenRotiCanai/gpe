#include <iostream>

using namespace std;

int main(){
    int n;
    cin >> n;
    while(n--){
        long long a, b, x, y;
        cin >> x >> y;
        if((x+y)%2){
            cout <<"impossible" << endl;
            continue;
        }

        b = (x-y)/2;
        if(b>=0){
            a = x-b;
            cout << a << " " << b << endl;
        }else cout << "impossible" << endl;   
    }
}