#include<iostream>
#include<vector>
using namespace std;

int main(){
    int n;
    vector<int>m;
    m.push_back(2);
    for(int i=3; m.size()<3501; i+=2){
        for(int j=2; j<=i; j++){
            if(i%j==0 && j!=i){
                break;
            }
            if(j==i){
                m.push_back(i);
            }
        }
    }
    while(cin>>n && n){
        int saved = 0;
        int temp = 0 ;
        for(int i=1,j=n-2; i<n; i++,j--){
            temp = (temp+m[j])%(i+1);
        }
        cout << temp+1<< endl;
    }
}