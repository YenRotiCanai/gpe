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
            arr[i] = x * 100 + y; //要把他變成整數，所以要乘100再加
            sum += arr[i]; //總額
        }

        //平均花費
        double avg = (double)sum / double(n);
        double diff1 = 0, diff2 = 0;

        //用avg來分高低
        for(int i=0; i<n; i++){
            if(avg > arr[i]) diff1 += floor(avg - arr[i]);
            else diff2 += floor(arr[i] - avg);
        }

        //要輸出差額最大的
        if(diff1 > diff2) printf("$%.2lf\n", diff1/100);
        else printf("$%.2lf\n", diff2/100);
    }
    return 0;
}