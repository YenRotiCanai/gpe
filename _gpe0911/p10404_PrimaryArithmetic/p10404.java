import java.util.Scanner;
import java.util.Arrays;
class p10404{

	static int divide(int n, int arr[]){
		for(int i=0; i< arr.length; i++){
			arr[i] = n%10;
			n/=10;
		}
		return 0;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if( a == 0 && b == 0) break;

			//算這兩個的長度，拿最長的那個(lenM)來跑最後一段，省次數
			//要算 int 的長度必須先轉成 String 才可以算
			int lenA = Integer.toString(a).length();
			int lenB = Integer.toString(b).length();
			int lenM = Math.max(lenA, lenB);

			int arrA[] = new int[11];
			int arrB[] = new int[11];
			int sum[] = new int[12];			

			divide(a, arrA);
			divide(b, arrB);

			// System.out.println(Arrays.toString(arrA));
			// System.out.println(Arrays.toString(arrB));
			// System.out.println(lenM);

			int ans = 0;

			for(int i=0; i<lenM; i++){
				sum[i]+=(arrA[i]+arrB[i]);
				if(sum[i]>=10){
					sum[i]-=10;
					sum[i+1]++;
					ans++;
				}
			}

			if(ans == 0) System.out.println("No carry operation.");
			else if(ans == 1) System.out.println("1 carry operation.");
			else System.out.printf("%d carry operations.\n", ans);
		}
	}
}