import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            BigInteger c = a.multiply(b);

            System.out.println(c);
        }

	}
}