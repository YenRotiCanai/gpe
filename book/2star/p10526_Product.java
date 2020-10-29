//直接用 biginteger，可是要先算好才 print
//不然會time limit

import java.math.BigInteger;
import java.util.Scanner;

class Product {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger b1 = sc.nextBigInteger();
            BigInteger b2 = sc.nextBigInteger();
            BigInteger ans = b1.multiply(b2);

            System.out.println(ans);
        }
        sc.close();
    }
}