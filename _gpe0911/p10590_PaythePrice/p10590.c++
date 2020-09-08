#include<iostream>
#include<algorithm>
#include<string>
#include<sstream>
using namespace std;
long long dp[301][1001] = {0};

ing main(){
	dp[0][0] = 1;
	for(int i=0; i<=300; i++){
		for(int j=0; j+i<=300; j++){
			for(int k=1; k<=1000; k++){
				dp[j+i][k] += dp[j][k-1];
			}
		}
	}
}