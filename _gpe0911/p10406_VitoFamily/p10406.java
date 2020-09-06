import java.util.Scanner;
import java.util.Arrays;
//import java.util.Math;

class p10406{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt(); //cases數量

		while(cases-->0){
			int n = sc.nextInt(); //鄰居數量
			int arr[] = new int[n]; //宣告鄰居的array

			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt(); //把門牌放進去array
			}

			Arrays.sort(arr); //排序門牌陣列
			int sum = 0; //最後答案的加總

			//最後一段
			int mid = arr[n/2]; //中位數
			for(int i=0; i<n; i++){
				sum += Math.abs(mid-arr[i]);
			}

			//最後一段也可以這樣寫
			// for(int i=0; i<n; i++){
			// 	sum += Math.abs(arr[n-2]-arr[i]);
			// }

			//又或是這樣
			// for(int i:arr){
			// 	sum += Math.abs(arr[n/2] - i);
			// }

			System.out.println(sum);
		}
	}
}