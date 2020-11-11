//求公因數(Common Factor)，如果只有1和自己，就是 'All you need is love!'
//反之，若還有其他公因數，就是 'Love is not all you need!'
//http://hellowalk.blogspot.com/2017/12/java-uva-10193-all-you-need-is-love.html

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i=1; i<=n; i++){
			//用 integer.parseInt 把 2 進制轉換成 10 進制
			int b1 = Integer.parseInt(sc.nextLine(), 2);
			int b2 = Integer.parseInt(sc.nextLine(), 2);

			int tmp;

			while(b2>0){
				tmp = b1 % b2;
				b1 = b2;
				b2 = tmp;
			}

			if(b1>1) System.out.println("Pair #"+i+": All you need is love!");
			else System.out.println("Pair #"+i+": Love is not all you need!");
		}
	}
}