//https://blog.xuite.net/b81621java/blog/134509857-10408%3A+What+is+the+Probability%3F

/*
當q小於1 求無窮等比級數和 q^n 趨近於零

   s=a/(1-q)

package _Final;
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class p10408{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int s = sc.nextInt();
			for(int i=0; i<s; i++){
				int n = sc.nextInt();
				BigDecimal p = new BigDecimal(sc.next());
				BigDecimal q = BigDecimal.ONE.subtract(p);
				int goal = sc.nextInt();

				if(p.equals(BigDecimal.ONE)){
					if(goal == 1){
						System.out.println("1.0000");
					}else{
						System.out.println("0.0000");
					}
					continue;
				}else if(p.equals(BigDecimal.ZERO)){
					System.out.println("0.0000");
					continue;
				}

				BigDecimal ratio = q.pow(n);
				BigDecimal ans = p.multiply(q.pow(goal-1));
				BigDecimal divisor = BigDecimal.ONE.subtract(ratio);
				ans = ans.divide(divisor, 4, BigDecimal.ROUND_HALF_UP);
				System.out.println(ans);
			}
		}
	}
}