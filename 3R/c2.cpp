//題目的 M 是小 level，N是大 size

#include <stdio.h>

int main() {
    int cases = 0, n, m;
    while(scanf("%d %d", &n, &m) == 2) {
        if(n == 0 && m == 0)
            break;
        int i, j, k, l;
        int h = n*m-1; //前面要留多少空格
        printf("Triangular Museum %d\n", ++cases);
        for(i = 0; i < m; i++) {// 小 level
            for(j = 0; j < n; j++) { //大 level
                for(k = 0; k < h; k++)
                    putchar(' ');
                h--;
                for(k = 0; k <= i; k++) {
                    putchar('/');
                    for(l = 0; l < 2*j; l++)
                        putchar(j == n-1 ? '_': ' ');
                    putchar('\\');
                    if(k != i) {
                        for(l = 2; l < 2*n-2*j; l++)
                            putchar(' ');
                    }
                }
                puts("");
            }
        }
        puts("");
    }
    return 0;
}