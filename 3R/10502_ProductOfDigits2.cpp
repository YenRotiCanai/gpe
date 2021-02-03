//https://hwchen18546.wordpress.com/2014/03/03/acm-10502product-of-digits/
#include <stdio.h>
#include <string.h>
using namespace std;
 
int Q[40] = {0};
 
int main () {
    int case_no, n;
    int index;
    scanf("%d", &case_no);
    while (case_no--) {
        index = 0;
        memset(Q, 0, sizeof(Q));
        scanf("%d", &n);
        if (n != 1) {
            for (int i = 9; i > 1; i--) {
                while (n % i == 0) {
                    Q[index] = i;
                    index++;
                    n = n / i;
                }
                if (n == 1) break;
            }
            if (n != 1)
                printf("-1\n");
            else {
                for (int i = index-1; i >= 0 ; i--)
                    printf("%d", Q[i]);
                printf("\n");
            }
        }
    else
        printf("1\n");
    }
    return 0;
}