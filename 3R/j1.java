//https://blog.xuite.net/b81621java/blog/147444520-10517%3A+Hartals

import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
		int n = Integer.parseInt(sc.nextLine());
		int s1, s2;

		for(int i=1; i<=n; i++){

			//用 Integer.parseInt(sc , 2) 來回傳 2 進制的 int
			s1 = Integer.parseInt(sc.nextLine(), 2);
			s2 = Integer.parseInt(sc.nextLine(), 2);

			if(GCD(s1, s2) > 1) System.out.println("Pair #" + i + ": All you need is love!");
			else System.out.println("Pair #" + i + ": Love is not all you need!");
		}
    }

	static int GCD(int x, int y){
		if(x%y==0) return y;
		else return GCD(y, x%y);
	}
}