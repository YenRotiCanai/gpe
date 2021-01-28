//https://github.com/prokawsar/UVa/blob/master/10523%20-%20Very%20Easy.java
import java.util.Scanner;
import java.math.BigInteger;

class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BigInteger sum, tmp;
        int N, A;

        while(sc.hasNext()){
            N = sc.nextInt();
            A = sc.nextInt();

            sum = new BigInteger("0");
            tmp = BigInteger.valueOf(A);

            for(int i=1; i<=N; i++){
                sum = sum.add(BigInteger.valueOf(i).multiply(tmp.pow(i)));
            }
            System.out.println(sum);
        }
    }
}