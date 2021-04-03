//https://a7069810.pixnet.net/blog/post/394903351-%5Buva10062%5D-tell-me-the-frequencies%21
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean newLine = false;

		while(sc.hasNext()){
			if(newLine) System.out.println();

			String str = sc.nextLine();
			int arr[] = new int[128]; //雖然範圍是從32-128，但是不用管那麼多，直接用 128

			//統計每個字元出現的次數
			for(int i=0; i<str.length(); i++){
				arr[str.charAt(i)]++;
			}

			//找出最多次數的那一個
			int max = 0;
			for(int i=0; i<arr.length; i++){
				if(arr[i]>max) max = arr[i];
			}

			//由最少次數，從陣列的最後面開始找，這樣就符合題目要求的先從小到大印出次數，再來才是看ASCII的順序
			for(int i=1; i<=max; i++){
				for(int j=arr.length-1; j>=0; j--){
					if(i == arr[j]) System.out.println(j+" "+i);
				}
			}
			newLine = true;
		}
		
	}
}