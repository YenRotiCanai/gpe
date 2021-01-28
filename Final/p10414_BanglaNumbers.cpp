//http://andy10234b.blogspot.com/2016/05/cpe10414bangla-numbers.html
//他原本 output 的那個 function 是用 longlongint，可是因為他沒有 return 東西，所以要用 void，雖然他沒用可是還是可以過，只是在手動執行的時候會出warning

#include <iostream>

#define kuti 10000000
#define lakh 100000
#define hajar 1000
#define shata 100

using namespace std;

void output(long long int input){

	if(input/kuti){
		output(input/kuti);
		cout << " " << "kuti";
		input %= kuti;
	}
	if(input/lakh){
		output(input/lakh);
		cout << " " << "lakh";
		input %= lakh;
	}
	if(input/hajar){
		output(input/hajar);
		cout << " " << "hajar";
		input %= hajar;
	}
	if(input/shata){
		output(input/shata);
		cout << " " << "shata";
		input %= shata;
	}

	if(input){
        cout<<" "<<input;
    }

}

int main(){
	long long int input;

	int cases = 1;

	while(cin >> input){
		cout << cases << ".";
		
		output(input);
		
		cases++;

		cout << endl;
	}
}