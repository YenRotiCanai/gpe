#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;

//為了確保 double 的精準度，要加上一個 1e-9
const double EPSILON = 1e-9;

int main(){
    int N;

    while(scanf("%d", &N)!=EOF && N!=0){
        int layer = (int)(sqrt((double)(N-1)) + EPSILON) + 1 ;
    }
}