import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int rd = 1, count = 1;
            int n = sc.nextInt();

            while(rd%n!=0){
                count++;
                rd = (rd*10+1)%n;
            }

            System.out.println(count);
        }
    }
}

/*
*
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
 * 
 */