#include <iostream>
using namespace std;

const int MX_BASE = 36;

int main(){
    int m; cin >> m;

    for(int k=1; k<=m; k++){
        if(k>1) cout << endl;

        cout << "Case " << k << ":" << endl;

        int priceTable[MX_BASE];

        for(int i=0; i<MX_BASE; i++){
            cin >> priceTable[i];
        }

        int n; cin >> n;
        while(n--){
            int x; cin >> x;

            int cheapest[MX_BASE+1];
            for(int i=2; i<=MX_BASE; i++){
                int t = x;
                cheapest[i] = 0;

                do{
                    cheapest[i] += priceTable[t%i];
                    t/=i;
                }while(t!=0);
            }

            int min = cheapest[2];
            for(int i=3; i<=MX_BASE; i++){
                if(cheapest[i] < min) min = cheapest[i];
            }

            cout << "Cheapest base(s) for number " << x << ":";

            for(int i=2; i<=MX_BASE; i++){
                if(cheapest[i] == min) cout << " " << i;
            }
            cout << endl;
        }
    }
    return 0;
}