import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int arr[] = new int[n];

			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}

			//開一個陣列來記錄每一筆測資的 lis 長度
			//先將他們預設成 1
			int length[] = new int[n];
			Arrays.fill(length, 1);

			int maxLength = 0;

			for(int i=0; i<arr.length; i++){
				int currNum = arr[i];

				//for loop 從 0 開始一直跑到 i，j 是 i 的前面
				for(int j=0; j<i; j++){
					int prevNum = arr[j];

					//如果 prev 小過 curr 且 j 的長度 +1 大於 i 的話
					//就表示他是 i 的其中一個 lis，所以 i 的長度就變成是 j長度 + 1
					if(prevNum < currNum && length[j]+1 >= length[i]){
						length[i] = length[j] + 1;
					}
				}

				//只要 i 長度大於最長，就把最長改成 i 長度
				if(length[i] > maxLength){
					maxLength = length[i];
				}
			}
			System.out.println(maxLength);
		}
	}
}