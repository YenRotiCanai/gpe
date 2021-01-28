//10414:Bangla Numbers
#include <iostream>

#define kuti 10000000
#define lakh 100000
#define hajar 1000
#define shata 100

using namespace std;

void calc(long long input){

	if(input/kuti){
		calc(input/kuti);
		cout << " kuti";
		input %= kuti;
	}
	if(input/lakh){
		calc(input/lakh);
		cout << " lakh";
		input %= lakh;
	}
	if(input/hajar){
		calc(input/hajar);
		cout << " hajar";
		input %= hajar;
	}
	if(input/shata){
		calc(input/shata);
		cout << " shata";
		input %= shata;
	}

	if(input){
		cout << " " << input;
	}
}

int main(){
	long long input;
	int cases = 1;

	while(cin >> input){
		cout << cases << ".";

		calc(input);

		cases++;
		
		cout << endl;
	}
}