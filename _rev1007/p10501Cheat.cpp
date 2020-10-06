#include <iostream>
using namespace std;

int main(){
	int p[11] = {1,1,2,5,14,42,132,429,1430,4862,16796};
	int n, count = 1;
	while(cin>>n ){
		if(count>1) cout<<endl;
		cout<<p[n]<<endl;
		count++;
	}
}