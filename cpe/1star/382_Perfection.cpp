//直接用 mod 來檢查他是不是 factor，是的話就加進 sum
//最後 sum 和測資比較
#include <iostream>
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