#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main(){
    int cases;
    cin >> cases;

    while(cases--){
        int n, sum=0;
        string str, str2;

        cin >> n;
        int arr[n+1];
        cin.ignore();

        for(int i=1; i<=n; i++){
            getline(cin, str);

            if(str == "LEFT") arr[i] = -1;
            else if(str == "RIGHT") arr[i] = 1;
            else{
                string str2 = str.substr(8);
                istringstream isst(str2);
                int tmp;
                isst >> tmp;
                //int tmp = stoi(str2); stoi 要 c++11 才可以用，不然只能用istringstream
                arr[i] = arr[tmp];
            }
            sum += arr[i];
        }
        cout << sum << endl;
    }
}