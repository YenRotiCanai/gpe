#include <iostream>

using namespace std;

int GCD(int x, int y){
    if(x%y==0) return y;
    else return GCD(y, x%y);
}

int main(){
    int n;
	while(cin >> n && n!=0){
        long long G = 0;
        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                G += GCD(i, j);
            }
        }
        cout << G << endl;
    }
}