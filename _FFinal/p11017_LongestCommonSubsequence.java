//https://www.youtube.com/watch?v=Dumq-rceuac&ab_channel=BackToBackSWE

import java.util.*;

class Main{
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

                    if(c1 == c2) dp[i+1][j+1] = dp[i][j]+1;
                    else dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }

            System.out.println(dp[m][n]);
        }
    }
}