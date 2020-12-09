#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;

int main(){
    int m, n, t;
    while(scanf("%d %d %d", &m, &n, &t)!=EOF){
        int minBTime = min(m, n);
        int maxBTime = max(m, n);

        int maxBAmount = t / minBTime;
        int remainT = t % minBTime;
        cout << "maxBA:" << maxBAmount << ", remainTime:" << remainT << endl;

        for(int i=maxBAmount-1; i>=0 && remainT !=0; i--){
            int newRemainT = t - i * minBTime;
            int newBAmount = newRemainT / maxBTime;
            cout<<"nRT:"<<newRemainT<<", newBAmount:"<<newBAmount<<endl;
            newRemainT -= newBAmount * maxBTime;
            cout << "nRT:" << newRemainT << endl;

            if(newRemainT < remainT){
                cout << "newRemainT < remainT" << endl;
                maxBAmount = i+newBAmount;
                remainT = newRemainT;
                cout << "maxBAmount:" << maxBAmount << ", remainT:" << remainT << endl;
            }
        }

        printf("%d", maxBAmount);
        if(remainT > 0) printf(" %d",remainT);
        printf("\n");
    }
    return 0;
}