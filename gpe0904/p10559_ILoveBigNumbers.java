import java.math.BigInteger;
import java.util.Scanner;

class p10559_ILoveBigNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a, r;
        int n;

        while(sc.hasNext()){
            n = sc.nextInt();
            a = new BigInteger("1");
            r = new BigInteger("1");
            int i = 1;
            while( i <= n){
                r = r.multiply(a);
                a = a.add(new BigInteger("1"));
                i++;
            }
            int sum = 0;
            BigInteger resultAndRemainder[];
            do{
                resultAndRemainder = r.divideAndRemainder(BigInteger.TEN); // r mod 10
                sum += resultAndRemainder[1].intValue(); // sum = sum + resultAndRemainder[1] 裡面的值
                r = resultAndRemainder[0]; //
            }while(r.compareTo(BigInteger.ZERO)!=0);

            System.out.println(sum);
        }
    }
}