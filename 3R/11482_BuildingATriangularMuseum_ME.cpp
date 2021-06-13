//https://mypaper.pchome.com.tw/zerojudge/post/1324842153
//題目的 M 是小 level，N是大 size
#include <cstdio>
using namespace std;

int main(){
    int cases = 1, m, n;
    while(scanf("%d %d", &m, &n) == 2){
        if(m==0 && n==0) break;

        int i, j, k, l;
        int h = m*n-1; //前面要留的空格數量

        printf("Triangular Museum %d\n", cases++);

        for(i=0; i<n; i++){ //大 size
            for(j=0; j<m; j++){ //小 level

                //印出前面的空格，印完後 -1
                for(k=0; k<h; k++) putchar(' ');
                h--;

                for(k=0; k<=i; k++){
                    putchar('/');
                    
                    //判斷是不是最底層，如果是最後一層才印 '_'
                    for(l=0; l<2*j; l++)
                        putchar(j == n-1? '_':' ');
                    putchar('\\');

                    if(k != i){
                        for(l = 2; l<2*n-2*j; l++)
                            putchar(' ');
                    }
                }
            }
        }
    }
}