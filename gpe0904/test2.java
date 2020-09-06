import java.math.BigInteger;
import java.util.Scanner;

class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = new BigInteger("4");
        BigInteger B = A.multiply(BigInteger.TEN);
        BigInteger C = A.divide(BigInteger.TWO);
        BigInteger D = A.add(A);
        BigInteger E = BigInteger.valueOf(60);

        System.out.println(A+", "+B+", "+C+", "+D+", "+E);
    }
}