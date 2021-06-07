//把全部factor加起來，建一個表，然後再查表看是不是和輸入一樣
//從大查到小
#include <iostream>
#include <cstdio>
using namespace std;

int main(){

    int arr[1001];
    for(int i=1; i<1001; i++){
        arr[i] = 0;
        for(int j=1; j<=i; j++){
            if(i%j == 0){
                arr[i] += j;
            }
        }
    }

    int n;
    int cases = 1;
    while(cin >> n && n){
        int found = -1;
        for(int i=1000; i>0; i--){
            if(arr[i] == n){
                found = i;
                break;
            }
        }
        printf("Case %d: %d\n", cases++, found);
    }
}