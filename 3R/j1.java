import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while(n-->0){
			int len = sc.nextInt();

			int arr[] = new int[len];

			for(int i=0; i<len; i++){
				arr[i] = sc.nextInt();
			}
			//System.out.println(Arrays.toString(arr));

			int count = 0;

			boolean sorted = true;
			
			int pt = 0;
			while(sorted){
				sorted = false;
				for(int i=0; i<len-1; i++){
					if(arr[i]>arr[i+1]){
						int tmp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = tmp;
						sorted = true;
						count++;
					}
				}
				
			}

			System.out.printf("Optimal train swapping takes %d swaps.%n",count);
		}
	}
}