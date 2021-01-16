//這題老師好像不給用 java 來寫
//https://knightzone.studio/2012/01/19/1375/uva%EF%BC%9A374%EF%BC%8Dbig-mod/

//下面這個是 java 解答
//https://blog.xuite.net/b81621java/blog/85442155-22151%3A+Big+Mod

#include<iostream>
#include<cstdio>

using namespace std;

long long bigmod(long long B, long long P, long long M){
	if(P == 0) return 1; //如果 power 是 0，那就回傳 1
	else if(P == 1) return B % M; //如果 power 是 1，那就單純的 B mod M
	else{
		long long result = bigmod(B, P/2, M); //不然就再丟給自己跑多一次，可是這次的 P 要除2

		if(P % 2) return result * result * B % M; //如果 P mod 2 == 1，就把 B 也乘進來
		else return result * result % M; //如果 P mod 2 == 0，就單純 result^2 mod M
	}
}

int main(){
	long long B, P, M;

	while(scanf("%lld%lld%lld", &B, &P, &M) != EOF){
		printf("%lld\n", bigmod(B, P, M));
	}

	return 0;
}