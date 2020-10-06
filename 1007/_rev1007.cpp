#include <iostream>
#include <cstdlib>
#include <cstring>
 
using namespace std;
 
int fact[1005][2600];
int sums[1005];
 
int main()
{
	//打表计算
	memset( fact, 0, sizeof(fact) );
	memset( sums, 0, sizeof(sums) );
	fact[0][0] = 1;
	for ( int i = 1 ; i < 1001 ; ++ i ) {
		for ( int j = 0 ; j < 2570 ; ++ j )
			fact[i][j] = fact[i-1][j]*i;
		for ( int j = 0 ; j < 2570 ; ++ j )
			if ( fact[i][j] > 9 ) {
				fact[i][j+1] += fact[i][j]/10;
				fact[i][j] %= 10; 
			}
		for ( int j = 0 ; j < 2570 ; ++ j )
			sums[i] += fact[i][j];
	}
	 
	int n;
	while ( cin >> n )
		cout << sums[n] << endl;
		
	return 0;
}