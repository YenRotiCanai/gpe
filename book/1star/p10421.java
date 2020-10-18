//http://hellowalk.blogspot.com/2017/12/java-uva-10193-all-you-need-is-love.html

import java.util.Scanner;

class p10421{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int s1, s2;

		for(int i=1; i<=n; i++){

			//用 Integer.parseInt(sc , 2) 來回傳 2 進制的 int
			//這裏用一行就把 10 進位轉成 2 進位
			s1 = Integer.parseInt(sc.nextLine(), 2);
			s2 = Integer.parseInt(sc.nextLine(), 2);

			int tmp;

			while(s2>0){
				tmp = s1 % s2;
				s1 = s2;
				s2 = tmp;
			}

			if(s1 > 1) System.out.println("Pair #" + i + ": All you need is love!");
			else System.out.println("Pair #" + i + ": Love is not all you need!");
		}
		sc.close();
	}
}