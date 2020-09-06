//https://knightzone.studio/2011/12/05/1262/uva%EF%BC%9A10340%EF%BC%8Dall-in-all/
//解法：要找出第 1 個字的字母們有沒有被包含在第 2 母裡面

import java.util.Scanner;

class All2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){ //要用 EOF 結束，就是當沒有輸入後就結束程式
			String s1 = sc.next(); //用 .next() 抓同一行裡的字
			String s2 = sc.next();

			int s1Len = s1.length(); //取得兩個字的長度
			int s2Len = s2.length();

			int s1Index = 0; //用來記住S1的位置

			if(s1Len <= s2Len){ //只有在s1短於s2的情況下才會包含在裡面，雖然題目沒有特別要求，可是既然想到了就寫下去吧。
				char s1Arr[] = s1.toCharArray(); //把他們兩個都從string轉換成array
				char s2Arr[] = s2.toCharArray();

				for(int i=0; i<s2Len; i++){ //用 s2 長度當迴圈的次數
					if(s2Arr[i] == s1Arr[s1Index]) { //如果s2的字有對到s1的字，那s1的位置就+1，往下一個挪
						s1Index++;
						if(s1Index == s1Len) break; //當s1的位置和s1的長度一樣了，就代表他已經找到全部和s1有同樣的字了，那就break跳出來。
					}
				}

				if(s1Index == s1Len){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}

			}else{
				System.out.println("No");
			}
		}
	}
}