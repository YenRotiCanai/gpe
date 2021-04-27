import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger bArr[] = new BigInteger[5001];

		bArr[0] = BigInteger.valueOf(0);
		bArr[1] = BigInteger.valueOf(1);

		for(int i=2; i<5001; i++){
			bArr[i] = bArr[i-1].add(bArr[i-2]);
		}
		
		while(sc.hasNext()){
			int n = sc.nextInt();

			System.out.println("The Fibonacci number for "+n+" is "+bArr[n]);
		}
	}
}