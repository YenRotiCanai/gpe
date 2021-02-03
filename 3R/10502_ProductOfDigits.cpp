#include <iostream>
#include <vector>

using namespace std;

int main(){
    int cases;
	cin >> cases;
    while(cases--){
        int n;
        cin >> n;
        if(n==1) cout << 1 << endl;
        else{
            vector<int> vt;
            vector<int>::iterator iter;

            for(int i=9; i>1; i--){
                while(n%i==0){
                    vt.insert(vt.begin(), i);
                    n/=i;
                }
            }

            if(n==1){
                for(iter = vt.begin(); iter!=vt.end(); iter++){
                    cout << *iter;
                }
                cout << endl;
            }else{
                cout << "-1" << endl;
            }
        }
    }
    return 0;
}