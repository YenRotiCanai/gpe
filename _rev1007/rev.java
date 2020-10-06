import java.util.*;

class rev{
	public static long Reverse(long x){
		if(x<10) return x;
		else{
			long input = x, result = 0;
			while(input>0){
				result = (result*10)+(input%10);
				input /= 10;
			}
			return result;
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long cases = sc.nextLong();
		while(cases --> 0){
			long N = sc.nextLong();
			int count = 1;

			N += Reverse(N);

			while(Reverse(N) != N){
				N += Reverse(N);
				count++;
			}

			System.out.println(count+" "+N);
		}
	}
}