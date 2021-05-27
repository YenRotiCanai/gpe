#include<iostream>
#include<cstdio>
using namespace std;

int main(){
  int C, N;
  float score[1005], average, percent;
  while( scanf( "%d", &C ) != EOF ){
    for( int i = 1 ; i <= C ; i++ ){
      scanf( "%d", &N );
      average = 0.0;
      for( int j = 0 ; j < N ; j++ ){
        scanf( "%f", &score[j] );
        average += score[j];
      }
      average /= N;
      percent = 0.0;
      for( int j = 0 ; j < N ; j++ ){
        if( score[j] > average ) percent++;
      }
      percent /= N;
      percent *= 100;
      printf( "%.3f%%\n", percent );
    }
  }
  return 0;
}