//http://minstrel-uva.blogspot.com/2011/10/acm-10257.html
#include <cstdio>

using namespace std;

int main(){
    int s, p, y, j, x;

    while(scanf("%d %d %d %d", &s, &p, &y, &j) == 4){
        x = (12 + j - p - y) / 3;
        switch((12 + j - p - y) % 3){
            case 0:
                printf("%d %d %d\n", x+y, x+p, x);
                break;
            
            case 1:
                if( s + p == y) printf("%d %d %d\n", )
        }
    }
}