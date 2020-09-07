#include<iostream>;
#include<cstdio>;
#include<cctype>;
using namespace std;

int main(){
	int n, m, max_index;
	int runcase = 0;
	string answer, output;
	string input;
	bool ac, pe;
	while(scanf("%d", &n) != EOF && n != 0){
		getchar();
		answer = "";
		output = "";
		for(int i=0; i<n; i++){
			getline(cin, input);
			if(i) answer +='\n', answer += input;
			else answer = input;

			//--等等，我先看java的--//
			//java的比較好懂XD
		}
	}
}