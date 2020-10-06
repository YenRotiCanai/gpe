import java.util.Scanner;

class p10502{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while(cases-->0){
			long n = sc.nextLong();
			StringBuilder sb = new StringBuilder();

			if(n==1) sb=sb.insert(0,n);

			for(int i=9; i>1; i--){
				while(n%i==0){
					n /= i;
					sb = sb.insert(0,i);
				}
			}
			System.out.println(n==1? sb : -1);
		}
	}
}