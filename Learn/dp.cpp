#include <iostream>

using namespace std;

long long F[1000005];

long long f(int n){
	if(n==0) return 0;
	if(n==1) return 1;

	if(F[n]!=-1) return F[n];

	F[n] = f(n-1)+f(n-2);
	return F[n];
}

int main(){
	for(int i=0; i<100000; i++) F[i]= -1;
	int n;
	while(cin >> n)
		cout <<f(n)<<endl;
}