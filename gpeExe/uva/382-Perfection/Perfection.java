import java.util.Scanner;

class Perfection{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("PERFECTION OUTPUT");

		while((n=sc.nextInt()) != 0){
			int sum = 0;

			for(int i=1; i<n; i++){
				if(n % i == 0){
					sum += i;
					//System.out.println(sum);
				}
			}

			if(sum == n){
				System.out.printf("%5d  PERFECT\n",n);
			}else if(sum < n){
				System.out.printf("%5d  DEFICIENT\n",n);
			}else if(sum > n){
				System.out.printf("%5d  ABUNDANT\n",n);
			}

		}
		if(n == 0){
			System.out.println("END OF OUTPUT");
		}
	}
}