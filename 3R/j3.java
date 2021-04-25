import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<Integer> prime = new ArrayList<Integer>();

		for(int i=n; i<=m; i++){
			if(primeCheck(i)) prime.add(i);
		}

		System.out.println(prime);
	}

	public static Boolean primeCheck(int n){
		if(n == 1) return false;
		for(int i=2; i*i<=n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}