#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main(){
    int cases, n, sum;
    string str;
    cin >> cases;

    while(cases--){
        cin >> n;
        cin.ignore();
        int arr[n+1];
        
        sum = 0;
        for(int i=1; i<=n; i++){
            getline(cin, str);
            if(str == "LEFT") arr[i] = -1;
            else if(str == "RIGHT") arr[i] = 1;
            else{
                string str2 = str.substr(8);
                istringstream isst(str2);
                int tmp; isst >> tmp;
                arr[i] = arr[tmp];
            }
            sum += arr[i];
        }
        cout << sum << endl;
    }
}