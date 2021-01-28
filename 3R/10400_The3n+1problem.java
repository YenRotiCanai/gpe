//10400:3n+1

import java.util.*;

class main{

	static int calc_3n(long n){
		int count = 1;
		
		while(n!=1){
			if(n%2==0) n/=2;
			else n = 3 * n + 1;

			count ++;
		}

		return count;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long a = sc.nextLong();
			long b = sc.nextLong();

			System.out.print(a + " " + b + " ");
			int max = 0;

			if(a>b){
				long tmp = a;
				a = b;
				b = tmp;
			}

			for(long i=a; i<=b; i++){
				max = Math.max(calc_3n(i), max);
			}

			System.out.println(max);

		}
	}
}