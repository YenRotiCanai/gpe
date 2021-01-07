#include <iostream>
using namespace std;

int main(){

	int n;
	cin >> n;

	int hh = n / 3600;
	n %= 3600;

	int mm = n / 60;
	int ss = n % 60;

	cout << hh << " hr " << mm << " min " << ss << " sec" << endl;
	return 0;
}