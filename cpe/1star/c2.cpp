#include <iostream>
#include <cstdlib>
#include <iomanip>
using namespace std;

bool isnonrepeat(int a, int b){
    int n[10];
    if (a < 10000 && b < 10000)return false;
    for(int i = 0; i < 10; ++i)n[i] = 0;
    if (a < 10000 || b < 10000)n[0] = 1;
    while (a > 0){
        if (n[a % 10] == 1)return false;
        else n[a % 10] = 1;
        a /= 10;
    }
    while (b > 0){
        if (n[b % 10] == 1)return false;
        else n[b % 10] = 1;
        b /= 10;
    }
    return true;
}

int main(){
    int n;
    int a;
    bool ans;
    bool start = true;

    while (cin >> n){
        if (n == 0)break;
        if (!start)cout << endl;
        start = false;
        ans = false;
        for (int i = 1234; i < 49876; ++i){
            a = i * n;
            if (a > 99999)continue;
            else {
                if (isnonrepeat(a, i)){
                    ans = true;
                    cout << setw(5) << setfill('0') << a;
                    cout << " / ";
                    cout << setw(5) << setfill('0') << i;
                    cout << " = " << n << endl;
                }
            }
        }
        if (!ans){
            cout << "There are no solutions for " << n << "." << endl;
        }
	}
	return 0;
}