//https://knightzone.studio/2015/01/14/2668/uva%EF%BC%9A10161%EF%BC%8Dant-on-a-chessboard/
//http://naivered.github.io/2016/07/12/Problem_Solving/UVa/UVa-10161-Ant-on-a-Chessboard/
/*
先找出N應該位在哪一層，再找出那層的中間數，與中間數比較後即可求得x與y值
*/

#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;

//為了確保 double 的精準度，要加上一個 1e-9
const double EPSILON = 1e-9;

int main(){
    int N;

    while(scanf("%d", &N)!=EOF && N!=0){
        //找他是在第幾層
        int layer = (int)(sqrt((double)(N-1)) + EPSILON) + 1 ;
        
        //找 median
        int mid = (layer-1) * (layer-1) + layer;

        int x = layer, y = layer;

        if(layer % 2 == 0){
            if(N > mid) y -= N - mid;
            else x -= mid - N;
        }else{
            if(N > mid) x -= N - mid;
            else y -= mid - N;
        }

        printf("%d %d\n", x, y);
    }
    return 0;
}