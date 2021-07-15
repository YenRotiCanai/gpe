#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>

using namespace std;

int main(){
    int n, m, p, n1, m1;
    
    while(cin >> n >> m >> p){

        int arr[n+1];
        int maxdistance = 0;

        for(int i=0; i<p; i++){
            cin >> n1 >> m1;
            arr[i] = n1;
        }

        if(p == 1){
            cout << 1 << endl;
            continue;
        }

        for(int i=0; i<p-1; i++){
            int a = arr[i], b = arr[i+1];
            int c = abs(a - b) / 2;
            printf("a:%d b:%d c:%d max:%d\n", a, b, c, maxdistance);
            maxdistance = max(c, maxdistance);
        }

        cout << maxdistance << endl;
    }

    return 0;
}