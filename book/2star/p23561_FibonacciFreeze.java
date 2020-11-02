import java.util.Scanner;
import java.math.BigInteger;

public class p23561_FibonacciFreeze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        BigInteger fib[] = new BigInteger[5001];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        for(int i=2; i<5001; i++){
            fib[i] = fib[i-1].add(fib[i-2]);
        }

        while(sc.hasNext()){
            int n = sc.nextInt();
            String ans = fib[n].toString();
            System.out.println("The Fibonacci number for "+n+" is "+ans);
        }
        sc.close();
    }
}
