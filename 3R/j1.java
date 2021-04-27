/**
解法：  s = a^n
一段字串 a 會在 s 裡面總共出現 n 次
n 要取最大的，表示 a 要取最短
所以從最小的 a 開始取，再測後面的
*/

import java.util.*;

class Main{
	static int m, n;
	static char map[][];
	static boolean collected[][];

	public static void collectOil(int i, int j){
		if(i<0 || j<0 || i>=m || j>= n) return; //檢查邊界
		else if(map[i][j] == '*' || collected[i][j]==true) return; //如果檢查過了就跳過
		else{
			collected[i][j] = true;
			collectOil(i-1, j-1);
			collectOil(i-1, j);
			collectOil(i-1, j+1);
			collectOil(i, j-1);
			collectOil(i, j+1);
			collectOil(i+1, j-1);
			collectOil(i+1, j);
			collectOil(i+1, j+1);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
<<<<<<< HEAD

			String str = sc.nextLine();
			if(str.equals(".")) break;

			//把測資裡面的字元全部切開來放進陣列裡
			char cArr[] = str.toCharArray();
			int len = str.length();
			boolean flag = false;

			for(int i=1; i<=len; i++){

				//先看 i 可不可以被這組測資整除，如果不行，就代表他裡面沒有 a 的存在，可以直接跳過
				if(len % i != 0) continue;

				flag = true;

				//注意！這裏每次都要加 i 次！！
				for(int j=i; j<len && flag==true; j+=i){
					for(int k=0; k<i && flag==true; k++){
						if(cArr[k] != cArr[j+k]) flag = false;
					}
=======
			m = sc.nextInt();
			n = sc.nextInt();
			sc.nextLine();

			if(m == 0) break;

			map = new char[m][n];
			collected = new boolean[m][n];

			String str;
			for(int i=0; i<m; i++){
				str = sc.nextLine();
				for(int j=0; j<n; j++){
					map[i][j] = str.charAt(j);
					collected[i][j] = false;
>>>>>>> 27e333177a2ebd9fa82f59841c14e127a4e518bf
				}

<<<<<<< HEAD
				//如果比對完了，全部都有對上，就印出 長度/i
				if(flag){
					System.out.println(len / i);
					break;
				}
			}
=======
			int sum = 0;
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					if(map[i][j]=='@' && collected[i][j]==false){
						sum++;
						collectOil(i, j);
					}
				}
			}
			System.out.println(sum);
>>>>>>> 27e333177a2ebd9fa82f59841c14e127a4e518bf
		}

	}
}