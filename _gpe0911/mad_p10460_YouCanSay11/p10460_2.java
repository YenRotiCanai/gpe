import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedInputStream(System.in));
        BigInteger bigInt;
        String s;

        while (!(s=in.nextLine().trim()).equals("0")) {
            System.out.print(s);
            while (s.charAt(0)=='0') s = s.substring(1);
            bigInt = new BigInteger(s);
            if (bigInt.divideAndRemainder(new BigInteger(String.valueOf(11)))[1].
                equals(BigInteger.ZERO))
                System.out.println(" is a multiple of 11.");
            else
                System.out.println(" is not a multiple of 11.");
        }
    }
}