import java.util.Scanner;
import java.util.Arrays;

class test {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		while(cases-->0){
			int L = sc.nextInt();
			int arr[] = new int[L];
			for(int i=0; i<arr.length; i++){
				arr[i] = sc.nextInt();
			}

			int count = 0;


			for(int i=0; i<L-1; i++){

				//System.out.print("i:"+i);
				//重點就是這個 j<L-i-1, 第二層迴圈的限制要減掉第一層的 i，才可以每次都減少一次
				for(int j=0; j<L-i-1; j++){

					//System.out.print(" j:"+j);
					//System.out.println(" a:"+arr[j]+" ,b:"+arr[j+1]);
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