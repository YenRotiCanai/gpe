#include <iostream>
#include <cstdio>
using namespace std;

int main(){
    int c;
    float arr[1005];
    while(scanf("%d", &c)!=EOF){
        
        for(int i=0; i<c; i++){
            int n;
            scanf("%d", &n);

            float avg = 0.0;
            for(int i=0; i<n; i++){
                scanf("%f", &arr[i]);
                avg += arr[i];
            }

            avg /= n;
            float p = 0.0;
            for(int i=0; i<n; i++){
                if(arr[i] > avg) p++;
            }

            p = p / n * 100;

            printf("%.3f%%\n", p);
        }
    }
    return 0;
}