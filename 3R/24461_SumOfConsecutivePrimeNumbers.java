import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i=2; i<10000; i++){
			if(isPrime(i)) arr.add(i);
		}

		//System.out.println(arr);

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;

			int count = 0;
			
			
			
			for(int i=0; arr.get(i)<=n; i++){
				int sum = 0;
				int j = i;
				while(sum<n){
					sum += arr.get(j);
					j++;
				}
				if(sum == n){
					count ++;
					continue;
				}
			}
			System.out.println(count);
		}
	}

	public static boolean isPrime(int n){
		for(int i=2; i<n; i++){
			if(n%i==0) return false;
		}
		return true;
	}
}