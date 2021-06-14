#include <iostream>
#define max_fac 12

using namespace std;

int main(){
    int fac[max_fac];
    fac[0] = 0;
    fac[1] = 1;
    for(int i=2; i<max_fac; i++){
        fac[i] = i * fac[i-1];
    }

    unsigned int n;
    int m;
    while(cin >> n && n != -1){

        if(n == 0){
            cout << 0 << endl;
            continue;
        }

        for(int i=max_fac-1; i>0; i--){
            if(n==0) cout << 0 << " ";

            //cout << "n:" << n << endl;
            
            if(fac[i] > n) continue;
            else{
                m = n / fac[i];
                n %= fac[i];
                cout << m << " ";
            }
        }
        cout << 0 << endl;
    }

    return 0;
}