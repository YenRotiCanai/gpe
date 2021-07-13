import java.util.*;
import java.math.BigInteger;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger fact[] = new BigInteger[1001];

        //建 factorial 的表格
        fact[0] = BigInteger.ONE;
        for(int i=1; i<1001; i++){
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
        }
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            int ans = 0;
            String st = fact[n].toString();

            for(int i=0; i<st.length(); i++){
                ans += st.charAt(i) - '0';
            }
            System.out.println(ans);
        }
    }
}