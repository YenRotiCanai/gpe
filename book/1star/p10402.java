//http://hellowalk.blogspot.com/2018/07/java-uva-10008-whats-cryptanalysis.html

import java.util.Scanner;

class p10402{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c[] = new int[300]; //用來放 A～Z 的
		int len = 0;
		int n = Integer.valueOf(sc.nextLine());

		while(n-->0){
			String s = sc.nextLine(); //吃一行進來
			len+=s.length(); //那一行的長度（字數）
			s = s.toUpperCase(); //全部變成大寫
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					c[s.charAt(i)]++;
			}
		}

		while(len-->1){
			for(int i='A'; i<='Z'; i++){
				if(c[i] == len)
					System.out.println((char)i+" "+len);
			}
		}
	}
}