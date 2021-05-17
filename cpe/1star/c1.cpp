#include <iostream>
#include <vector>
#include <cstdio>
using namespace std;

int main(){
    
    cout << "PERFECTION OUTPUT" << endl;

    int n;
    while(cin >> n && n){
        int sum = 0;

        for(int i=1; i<n; i++){
            if(n % i == 0) sum += i;
        }

        if( sum == n ) printf("%5d  PERFECT\n", n);
        else if(sum > n) printf("%5d  ABUNDANT\n", n);
        else printf("%5d  DEFICIENT\n", n);

    }
    cout << "END OF OUTPUT" << endl;
}