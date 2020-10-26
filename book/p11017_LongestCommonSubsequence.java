//心機：input會有null值或是空格
//這解法還是WA，不懂
//https://github.com/PuzzlesLab/UVA/blob/master/King/10405%20Longest%20Common%20Subsequence.java
//上面這個人的可以過，可是看不太懂他的解法
//改用c++

//https://www.youtube.com/watch?v=Dumq-rceuac&ab_channel=BackToBackSWE
//找到一個可以的了 XD

import java.util.Scanner;

class p11017{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			int m = str1.length();
			int n = str2.length();

			int dp[][] = new int[m+1][n+1];

			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					char c1 = str1.charAt(i);
					char c2 = str2.charAt(j);

					if(c1==c2) dp[i+1][j+1] = dp[i][j]+1;
					else dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}

			System.out.println(dp[m][n]);
		}
	}
}