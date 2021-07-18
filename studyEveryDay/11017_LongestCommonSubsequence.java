import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){

		if (System.getProperty("ONLINE_JUDGE") == null) {
            // Try block to check for exceptions
            try {
                System.setIn(new FileInputStream("input.txt"));
                System.setOut(new PrintStream(new FileOutputStream("output.txt")));
            }
  
            // Catch block to handle the exceptions
            catch (Exception e) {System.out.println("error");}
        }

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			//把兩個字串的長度存起來
			int m = s1.length();
			int n = s2.length();

			//開一個2維陣列
			int dp[][] = new int[m+1][n+1];

			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){

					//把兩個字串的子元取出來
					char c1 = s1.charAt(i);
					char c2 = s2.charAt(j);

					//比較兩個子元，如果一樣，就把自己的值 +1 後，存到右下角的格子裡
					//如果不一樣，就比較自己下面和右邊的值，拿最大的那個放到右下角格子裡
					if(c1 == c2) dp[i+1][j+1] = dp[i][j]+1;
					else dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}

			//最後印出最後一格的值
			System.out.println(dp[m][n]);
		}
	}
}