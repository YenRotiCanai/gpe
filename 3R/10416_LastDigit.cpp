#include <iostream>
#include <string>
using namespace std;

char bigN[101];
int table[200];

int NPowerOfN(int n){
    int nn=1;
    for(int i=1; i<=n; i++){
        nn = nn*n;
        nn %= 10;
    }
    return nn;
}

int sumN(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
        sum += NPowerOfN(i);
        sum %= 10;
    }
    return sum;
}

int main(){
    for(int i=1; i<=100; i++){
        table[i%100] = sumN(i);
    }

    while(cin >> bigN && strcmp(bigN, "0")){
        int len = strlen(bigN);
        int n = bigN[len-1]-'0';
        if(len > 1) n += (bigN[len-2] - '0') * 10;
        cout << table[n] << endl;
    }
    return 0;
}