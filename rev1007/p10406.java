import java.util.*;

class p10406{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt(); //測資數量
		while(cases --> 0){
			int n = sc.nextInt(); //鄰居數量
			int arr[] = new int[n]; //鄰居arr

			//插入鄰居門牌
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			int sum = 0;
			int mid = arr[n/2];
			for(int i=0; i<n; i++){
				sum += Math.abs(mid-arr[i]);
			}

			System.out.println(sum);
		}
	}
}