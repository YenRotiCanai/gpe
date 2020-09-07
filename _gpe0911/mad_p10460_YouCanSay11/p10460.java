//http://kpeggy.blogspot.com/2013/07/javayou-can-say-11.html
//為什麼這個會 WA 啊！！不懂！幹！明明output都是對的！

import java.math.BigInteger;
import java.util.*;

class p10460{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger c = new BigInteger("11");

		while(sc.hasNext()){
			String input = sc.next().trim(); //輸入用 String 來收
			BigInteger a = new BigInteger(input); //把字串轉成整數
			BigInteger b = a.mod(c); //取餘數

			if(input.equals("0")) break;

			if(b==BigInteger.ZERO){ //如果 b 是 0，那就是11的倍數了
				System.out.println(input + " is a multiple of 11.");
			}else{
				System.out.println(input + " is not a multiple of 11.");
			}
		}
	}
}