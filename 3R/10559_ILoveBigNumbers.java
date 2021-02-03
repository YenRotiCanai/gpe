import java.util.*;
import java.math.BigInteger;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        BigInteger big[] = new BigInteger[1001];
        big[0] = BigInteger.valueOf(1); //或是用 BigInteger.ONE 也可以

        for(int i=1; i<1001; i++){
            big[i] = BigInteger.valueOf(i).multiply(big[i-1]);
        }

        while(sc.hasNext()){
            int n = sc.nextInt();
            String str = big[n].toString();
            int sum = 0;
            for(int i=0; i<str.length(); i++){
                sum += str.charAt(i)-'0';
            }

            System.out.println(sum);
        }
	}
}