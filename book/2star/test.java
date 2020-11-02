import java.util.Scanner;
import java.math.BigInteger;

class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = 1;
        while(sc.hasNext()){
            int n = sc.nextInt();
            int p = sc.nextInt();
            if(n==0 && p==0) break;

            BigInteger sum = BigInteger.ZERO;
            while(n-->0){
                sum = sum.add(sc.nextBigInteger());
            }

            BigInteger ans = sum.divide(BigInteger.valueOf(p));

            String ansString = ans.toString();
            System.out.printf("Bill #%d costs %d: each friend should pay %d%n%n", cases, sum, ans);
            cases ++;
        }
    }
}