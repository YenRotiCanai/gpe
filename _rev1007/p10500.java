import java.util.Scanner;

class p10500{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long arr[] = new long[51];

		arr[0] = 1;
		arr[1] = 1;

		for(int i=2; i<51; i++){
			arr[i] = arr[i-1]+arr[i-2];
		}

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(arr[n]);
		}
	}
}