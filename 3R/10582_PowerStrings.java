/**
解法：  s = a^n
一段字串 a 會在 s 裡面總共出現 n 次
n 要取最大的，表示 a 要取最短
所以從最小的 a 開始取，再測後面的
*/

import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){

			//把測資裡面的字元全部切開來放進陣列裡
			String str = sc.nextLine();
			if(str.equals(".")) break;

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
						if(cArr[k] != cArr[k+j]) flag = false;
					}
				}

				//如果比對完了，全部都有對上，就印出 長度/i
				if(flag){
					System.out.println(len / i);
					break;
				}
			}
		}

		
	}
}