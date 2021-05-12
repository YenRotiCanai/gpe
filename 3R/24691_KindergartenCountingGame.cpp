#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;

int main(){
    char line[1000];

    while(gets(line)){
        int count = 0;
        int type = 0;
        for(int i=0; line[i]; i++){
            if(isalpha(line[i])){
                if(type==0) count++;

                type = 1;
            }else type = 0;
        }
        printf("%d\n", count);
    }
}