import java.util.Scanner;

public class test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuffer ans;
		int a1, a2, p;
		String s1, s2;
		boolean prime[] = new boolean[1000000];

		for(int i=0; i<1000000; i++) prime[i] = true;

		prime[0] = prime[1] = false;

		for(int i=2; i<1000000; i++){
			if(prime[i]){
				for(int j=i+i; j<1000000; j+=i){
					prime[j] = false;
				}
			}
		}

		while(sc.hasNext()){
			a1 = sc.nextInt();
			s1 = Integer.toString(a1);
			ans = new StringBuffer(s1);
			ans.reverse();
			s2 = ans.toString();
			a2 = Integer.parseInt(s2);

			if(prime[a1]){
				if(prime[a1]==prime[a2] && a1!=a2) System.out.println(a1+" is emirp.");
				else System.out.println(a1+" is prime.");
			}else System.out.println(a1+" is not prime.");
		}
	}
}