//http://kpeggy.blogspot.com/2013/07/javabeat-spread.html
//https://blog.xuite.net/b81621java/blog/144453046-10454%3A+Beat+the+Spread%21L

import java.util.*;

class p10431{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=0; i<num; i++){
			long s = sc.nextLong();
			long d = sc.nextLong();
			long a,b;

			//心機測資 1：總和為 1，差距為 0。 比數 1:0
			if(s+d == 1){
				System.out.println(1+" "+0);
				continue;
			}

			//心機測資 2：比數 0:0
			if(s==0 && d==0){
				System.out.println("impossible");
				continue;
			}

			a = s+d;

			//因為 a=(s+d)/2 的關係，所以 a 一定是偶數，必須判斷他是偶數才能繼續
			if(a%2!=0){
				System.out.println("impossible");
				continue;
			}else{
				a /= 2;
				b = s - a;
			}

			if(b<0){
				System.out.println("impossible");
				continue;
			}
			System.out.println(a+" "+b);
		}
	}
}