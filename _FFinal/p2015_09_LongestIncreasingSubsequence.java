import java.util.*;

class robot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


        while(sc.hasNext()){
            int n = sc.nextInt();
            int arr[] = new int[n];

            if(n==0) break;

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int dp[] = new int[n];
            Arrays.fill(dp,1);

            int res = 1;

            for(int i=1; i<n; i++){
                for(int j=0; j<i; j++){
                    if(arr[j] < arr[i]){
                        dp[i] = Math.max(dp[j]+1, dp[i]);
                    }
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println(res);
        }
	}
}