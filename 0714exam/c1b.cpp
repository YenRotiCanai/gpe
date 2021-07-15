#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <cmath>
#include <cstdio>

using namespace std;

int main(){
    long long n, m, p, n1, m1;  
    
    while(cin >> n >> m >> p){

        long long arr[n+1];
        long long maxdistance = 0;
        long long chair = 0;
        long long finalchair = 0;

        for(long long i=0; i<p; i++){
            cin >> n1 >> m1;
            arr[i] = n1;
        }

        if(p == 1){
            cout << 1 << endl;
            continue;
        }

        for(long long i=0; i<p-1; i++){
            long long a = arr[i], b = arr[i+1];
            long long distance = abs(a - b) / 2;
            
            chair = (a+b)/2;

            //printf("a:%lld b:%lld distance:%lld max:%lld chair:%lld\n", a, b, distance, maxdistance, chair);
            
            if(distance > maxdistance){
                maxdistance = distance;
                finalchair = chair ;
            }
            
        }

        cout << finalchair << endl;
    }

    return 0;
}