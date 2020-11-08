#include <iostream>
#include <cstdio>
using namespace std;

const int MAX_MAP_LIMIT = 100;

void visit(bool isVisited[][MAX_MAP_LIMIT+5], 
           char map[][MAX_MAP_LIMIT+5],
           int i, int j ){
  if( map[i][j] == '@' && !isVisited[i][j] ){
    isVisited[i][j] = true;
    visit( isVisited, map, i-1, j );
    visit( isVisited, map, i+1, j );
    visit( isVisited, map, i, j+1 );
    visit( isVisited, map, i, j-1 );
    visit( isVisited, map, i+1, j-1 );
    visit( isVisited, map, i+1, j+1 );
    visit( isVisited, map, i-1, j-1 );
    visit( isVisited, map, i-1, j+1 );
  }

}

int main(){
  int m, n;
  while( scanf("%d%d", &m, &n) != EOF && m > 0 ){
    char map[MAX_MAP_LIMIT+5][MAX_MAP_LIMIT+5] = {0};
    gets(map[0]); // for '\n'
    for( int i = 1 ; i <= m ; ++i ){
      gets(map[i]+1);
    }

    bool isVisited[MAX_MAP_LIMIT+5][MAX_MAP_LIMIT+5] = {0};
    int oilCount = 0;
    for( int i = 1 ; i <= m ; ++i ){
      for( int j = 1 ; j <= n ; ++j ){
        if( map[i][j] == '@' && !isVisited[i][j] ){
          ++oilCount;
          visit( isVisited, map, i, j );
        }
      }
    }

    printf("%d\n", oilCount);
  }
  return 0;
}