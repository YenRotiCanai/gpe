//換行用 %n 會 RE
#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;

int main(){
    char buf[128];
    int inputCount, h, m, s, t0=0, t1=0;
    double distance, v0=0.0, v1=0.0;

    while(gets(buf)){
        //在切割字串的同時，統計這次總共有吃到多少字串
        inputCount = sscanf(buf, "%d:%d:%d %lf", &h, &m, &s, &v1);
        
        //將時間換算成 秒
        t1 = h*3600 + m*60 + s;

        //距離 = 速度 * 時間
        //因為第一筆是發車，而發車的時候他是靜止不動的，還沒開始算距離
        //所以就把預設是 0 的 v0 拿來當成現在的速度
        //之後他會被替換成 v1 也就是題目給的速度
        //題目給的速度是 km/h，我們要換成 sec/h，所以要除 3600
        //和換算小時 -> 秒 一樣
        distance += v0 * (t1-t0) / 3600.0;

        //算好距離後，時間就可以給 t0，他就變成下一個的前置時間
        t0 = t1;

        //如果我們只分割了 3 個，代表這個沒有新的速度，就可以直接輸出答案
        //反之，如果不是 3 個的話，就表示有新的速度，這時候就把新的給 v0，這樣下一次算距離就是用新的速度了
        if(inputCount == 3) printf("%.2d:%.2d:%.2d %.2lf km\n", h, m, s, distance);
        else v0 = v1;
    }

    return 0;
}