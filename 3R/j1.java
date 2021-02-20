import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int cases = 1;
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 0;
            for(int i=a; i<=b; i++){
                if(i%2!=0) ans += i;
            }
            System.out.printf("Case %d: %d%n",cases,ans);
            cases++;
        }
	}
}