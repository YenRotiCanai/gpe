#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int main(){
    int n;
    while(cin >> n && n){
        int arr[1000] = {};
        int sum = 0;
        for(int i=0; i<n; i++){
            int x, y;
            scanf("%d.%d", &x, &y);
            arr[i] = x*100+y; //為了把他變成整數，所以乘上 100
            sum+=arr[i]; //把總額加起來
        }
        double avg = (double)sum/(double)n; //記錄平均花費
        double diff1 = 0, diff2 = 0;
        
        for(int i=0; i<n; i++){
            //floor是向下取整，eg:floor(-10.5) = -11
            if(avg>arr[i]) diff1+=floor(avg - arr[i]);
            else diff2 += floor(arr[i] - avg); 
        }

        if(diff1>diff2) printf("$%.2lf\n", diff1/100);
        else printf("$%.2lf\n", diff2/100);
    }
    return 0;
}