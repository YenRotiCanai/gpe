import java.util.*;
import java.math.*;

class p10559_ILoveBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger fact[] = new BigInteger[1001];
        
        fact[0] = BigInteger.ONE;
        for(int i=1; i<1001; i++){
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
        }

        while(sc.hasNext()){
            int n = sc.nextInt();
            int ans = 0;
            String str = fact[n].toString();

            for(int i=0; i<str.length(); i++){
                ans += str.charAt(i) - '0';
            }
            System.out.println(ans);
        }
        sc.close();
    }
}