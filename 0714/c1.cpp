#include <iostream>

using namespace std;

int main(){
    long n, m;
    int max_count=0;

    while(cin >> n >> m){
        cout << n << " " << m;

        if(n > m){
            long tmp = n;
            n = m;
            m = tmp;
        }

        int len = 1;

        for(int i=n; i<=m; i++){
            long q = i;
            len = 1;

            while(true){
                if(q == 1) break;
                if(q%2 == 0) q/=2;
                else q = 3*q+1;

                len++;
            }
            max_count = max(max_count, len);
        }

        cout << " " << max_count << endl;
    }
}