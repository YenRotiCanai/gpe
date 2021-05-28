#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;

int main(){
    char line[1000];

    while(gets(line)){
        int count = 0;
        int word = 0;
        for(int i=0; line[i]; i++){
            //如果他是字母，而狀態顯示不是的話，表示他是新的一個，count++
            //然後把狀態改成 1
            //如果有兩個非字母，那狀態就變成 0
            if(isalpha(line[i])){
                if(word==0) count++;

                word = 1;
            }else word = 0;
        }
        printf("%d\n", count);
    }
}