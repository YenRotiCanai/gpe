import java.util.*;

class p10406{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while(cases-->0){
			int n = sc.nextInt(); //鄰居數量
			int arr[] = new int[n]; //鄰居arr

			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr); //排序門牌
			int sum = 0; //最後答案加總

			int mid = arr[n/2]; //中位數
			for(int i=0; i<n; i++){
				sum += Math.abs(mid - arr[i]); //拿中位數 - 每個門牌後加總起來
			}

			System.out.println(sum);
		}
	}
}