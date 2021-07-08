//直接用 biginteger 乘
import java.util.*;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            BigInteger z = x.multiply(y);

            System.out.println(z);
        }
    }
}