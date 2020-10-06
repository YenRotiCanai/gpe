import java.math.BigInteger;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		BigInteger c = new BigInteger(String.valueOf(11));
		String s;

		while(sc.hasNext()){
			s = sc.next();

			if(s.equals("0")) break;

			System.out.print(s);

			BigInteger a = new BigInteger(s);
			BigInteger b = a.mod(c);

			if(b == BigInteger.ZERO){
				System.out.println(" is a multiple of 11.");
			}else{
				System.out.println(" is not a multiple of 11.");
			}
		}
	}
}