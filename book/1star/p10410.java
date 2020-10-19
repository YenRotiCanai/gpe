//https://a7069810.pixnet.net/blog/post/394903351-%5Buva10062%5D-tell-me-the-frequencies%21

import java.util.Scanner;

class p10410{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean newline = false; //為了控制換行

		while(sc.hasNextLine()){
			if(newline) System.out.println();
			String st = sc.nextLine();

			int arr[] = new int[128];
			int max = 0;

			//統計每個字元出現的次數
			for(int i=0; i<st.length(); i++) arr[st.charAt(i)]++;

			//找出最多次數的那一個
			for(int i=0; i<arr.length; i++){
				if(arr[i]>max) max = arr[i];
			}

			//由最少次數，從陣列的最後面開始找，這樣就符合題目要求的先從小到大印出次數，再來才是看ASCII的順序
			for(int i=1; i<=max; i++){
				for(int j=arr.length-1; j>=0; j--){
					if(arr[j]==i) System.out.println(j+" "+arr[j]);
				}
			}

			newline = true; //第一次過後開始要換行，所以這邊弄了一次以後，就可以了
		}
	}
}