import java.util.Scanner;

class p22811{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}

			int count = 0;
			for(int i=0; i<n-1; i++){
				for(int j=0; j<n-i-1; j++){
					if(arr[j]>arr[j+1]){
						int tmp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = tmp;
						count++;
					}
				}
			}
			System.out.println("Optimal train swapping takes "+count+" swaps.");
		}
	}
}