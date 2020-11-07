import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger n = sc.nextBigInteger();
            BigInteger rd = BigInteger.ONE;
            int count = 1;

            while(rd.mod(n)!=BigInteger.ZERO){
                count ++;
                rd = rd.multiply(BigInteger.TEN).add(BigInteger.ONE);
            }

            System.out.println(count);
        }
    }
}