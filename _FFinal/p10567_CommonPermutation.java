//把兩個字串分別用兩個陣列來統計裡面字母的出現次數
//最後看他們兩個有沒有最少出現過 1 次 ~ 兩個陣列裡的最小次數
//有就印出來

import java.util.Scanner;

class FFtest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			int arr1[] = new int[123];
			int arr2[] = new int[123];

			//統計每個字母的出現次數
			for(int i=0; i<s1.length(); i++){
				arr1[s1.charAt(i)]++;
			}

			for(int j=0; j<s2.length(); j++){
				arr2[s2.charAt(j)]++;
			}

			//從 a 開始
			for(char c='a'; c<='z'; c++){

				//看他們有沒有最少出現過 1 次，上限是兩個陣列裏的最少次數
				for(int num=1; num <= Math.min(arr1[c], arr2[c]); num++){
					System.out.print(c);
				}
			}
			System.out.println();
		}

	}
}