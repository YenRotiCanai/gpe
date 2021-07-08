//求公因數(Common Factor)，如果只有1和自己，就是 'All you need is love!'
//反之，若還有其他公因數，就是 'Love is not all you need!'
//http://hellowalk.blogspot.com/2017/12/java-uva-10193-all-you-need-is-love.html

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		sc.nextLine();

		for(int i=1; i<=n; i++){
			int s1 = Integer.parseInt(sc.nextLine(), 2);
			int s2 = Integer.parseInt(sc.nextLine(), 2);

			int gcd = GCD(s1, s2);

			if(gcd > 1) System.out.println("Pair #" + i + ": All you need is love!");
			else System.out.println("Pair #" + i + ": Love is not all you need!");

		}
    }

	public static int GCD(int a, int b){
		if(a % b == 0) return b;
		return GCD(b, a%b);
	}
}