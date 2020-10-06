import java.util.*;
import java.math.BigInteger;
class p10526{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger ans = a.multiply(b);
			System.out.println(ans);
		}
	}
}