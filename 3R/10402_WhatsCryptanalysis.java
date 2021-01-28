import java.util.*;

class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[150];
		char c;
		int count = 0;

		sc.nextLine();

		while(n-->0){
			String str = sc.nextLine().toUpperCase();
			for(int i=0; i<str.length(); i++){
				c = str.charAt(i);
				arr[c] ++;
				count ++;
			}
		}

		for(int k = count; k>0; k--){
			for( c = 'A'; c<='Z'; c++){
				if(arr[c] == k) System.out.println(c + " " + k);
			}
		}
	}
}