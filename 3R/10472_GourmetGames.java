/*https://a7069810.pixnet.net/blog/post/392463076-%5Buva11313%5D-gourmet-games

n = 參賽者數量
m = 每場比賽需要的參賽者數量

因為 n 每次都需要 m 個參賽者，而每場比賽都會有 1 個贏家進到下一輪
所以讓 n 每次都 減掉 m 後，把贏家加回來
再繼續減下去，一直到他小於 1 或者等於 1

小於 1 就代表這比賽舉辦不下，輸出 cannot do this
而等於 1 的話就是有最後的優勝者，這時就輸出比賽的場次

n = n - m + 1
*/
import java.util.*;

class j2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int count = 0;
            while(n>1){
                n = n - m + 1;
                count ++;
            }

            if(n==1) System.out.println(count);
            else System.out.println("cannot do this");
        }
       
	}
}