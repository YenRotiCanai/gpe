import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            str = str.replace("#","");

            BigInteger big = new BigInteger(str,2);
            //System.out.println(big);
            BigInteger d = BigInteger.valueOf(131071);

            if(big.mod(d) == BigInteger.ZERO) System.out.println("YES");
            else System.out.println("NO");

        }

	}
}