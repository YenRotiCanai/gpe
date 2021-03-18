#include <iostream>
using namespace std;

int main(){
    int b[105]={0}, n;
    int t=1;
    while(cin >> n){
        bool b2 = true;

        for(int i=1; i<=n; i++){
            cin >> b[i];
            if(b[i] <= b[i-1]) b2 = false;
        }

        int sum[20005]={};
        if(b2){
            for(int i=1; i<=n; i++){
                for(int j=i; j<=n; j++){
                    if(sum[b[i]+b[j]] != 0) b2 = false;
                    else sum[b[i]+b[j]] = 1;
                }
            }
        }
        

        cout << "Case #" << t++ << ": ";
        if(b2) cout << "It is a B2-Sequence.\n\n";
        else cout << "It is not a B2-Sequence.\n\n";

    }
}