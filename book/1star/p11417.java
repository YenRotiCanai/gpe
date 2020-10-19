//https://blog.xuite.net/b81621java/blog/149610338-11076%3A+GCD%09
//解說：http://hellowalk.blogspot.com/2018/04/java-uva-11417-gcd.html

import java.util.Scanner;

public class p10417{
	public static int GCD(int i, int j){
		if(i%j==0) return j;
		else return GCD(j, i%j);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;

			long g = 0;
			for(int i=1; i<n; i++){
				for(int j=i+1; j<=n; j++){
					g+=GCD(i,j);
				}
			}
			System.out.println(g);
		}
	}
}