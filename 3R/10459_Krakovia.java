import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = 1;

		while(sc.hasNext()){
			int n = sc.nextInt();
			int f = sc.nextInt();
			if(n==0 && f==0) break;

			BigInteger sum = BigInteger.ZERO;
			for(int i=0; i<n; i++){
				sum = sum.add(sc.nextBigInteger());
			}

			BigInteger ans = sum.divide(BigInteger.valueOf(f));

			System.out.printf("Bill #%d costs %d: each friend should pay %d%n%n", c, sum, ans);

			c++;
		}
	}
}