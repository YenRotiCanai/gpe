import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			int c1[] = new int[123]; //宣告存放每個字的陣列
			int c2[] = new int[123];

			for(int i=0; i<s1.length(); i++){
				c1[s1.charAt(i)]++; //把對應字母的位子+1
				
			}

			for(int j=0; j<s2.length(); j++){
				c2[s2.charAt(j)]++;
				
			}
			// System.out.println(Arrays.toString(c2));
			// System.out.println(Arrays.toString(c1));

			for(int k=79; k<=122; k++){ //從 79 到 122
			//用 Math.min 來比較那兩個位子的值，如果沒有東西的話就會是0，那就會跳出 for 迴圈，如果只有一個有，也只會是0，因為他只拿最小的那個，反之如果有最小值是大於等於1的，就表示那個字母兩邊都有，然後就把他print出來。
				for(int num=1; num<=Math.min(c1[k],c2[k]); num++){
					System.out.print((char)k);
				}
			}
			System.out.println();
		}
	}
}