import java.util.*;
import java.math.BigInteger;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.next();
            int base1 = sc.nextInt();
            int base2 = sc.nextInt();

            BigInteger convert = new BigInteger(str, base1);
            String convertTo = convert.toString(base2).toUpperCase();

            if(convertTo.length()>7) convertTo = "ERROR";
            System.out.println(String.format("%7s", convertTo));
        }
    }
}