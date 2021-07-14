//看看 sqrt後 和之前的是不是一樣
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-->0){
            long m = sc.nextLong();
            long n = (long)Math.sqrt(m);

            System.out.println(n*n==m? "yes":"no");
        }
	}
}