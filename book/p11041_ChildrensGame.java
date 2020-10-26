//宣告一個 comparator 來比較兩個數
//然後回傳到 main，用 arrays.sort排序
//最後把它從後面 print 出來

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class ChildrensGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;

			String arr[] = new String[n];
			for(int i=0; i<n; i++){
				arr[i] = sc.next();
			}

			Arrays.sort(arr, new Cmp());

			for(int j=arr.length-1; j>=0; j--){
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
}

class Cmp implements Comparator<String>{
	public int compare(String s1, String s2){
		String str1 = s1+s2;
		String str2 = s2+s1;

		return str1.compareTo(str2);
	}
}