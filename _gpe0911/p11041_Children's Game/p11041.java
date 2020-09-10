//宣告一個 comparator 來比較兩個數
//然後回傳到 main，用 arrays.sort排序
//最後把它從後面 print 出來

import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;

		while(sc.hasNext()){
			n = sc.nextInt();
			if(n==0) break;

			String arr[] = new String[n]; //宣告String的陣列來放
			for(int i=0; i<n; i++){
				arr[i] = sc.next(); //因為是要放進String的陣列，所以不能用nextInt，要用next把他以String的方式抓進來
			}

			// System.out.println(Arrays.toString(arr));

			Arrays.sort(arr, new Cmp());

			// System.out.println(Arrays.toString(arr));

			for(int j = arr.length-1; j>=0; j--){
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
}

//到現在弄不懂他這個運作的原理是什麼？
//為什麼會讓他在上面sort的時候會跟著排？
class Cmp implements Comparator<String>{
	public int compare(String s1, String s2){
		String str1 = s1+s2;
		String str2 = s2+s1;

		// System.out.println("str1:"+str1+", str2:"+str2);
		// System.out.println(str1.compareTo(str2));

		return str1.compareTo(str2);
	}
}