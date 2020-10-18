//https://a7069810.pixnet.net/blog/post/394871641-%5Buva10019%5D-funny-encryption-method

import java.util.Scanner;

class p10403{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		while(cases --> 0){
			int n = sc.nextInt();
			System.out.println(base10(n) + " " + base16(n));
		}
	}

	public static int base10(int n){
		int count = 0;
		while(n>0){
			if(n%2==1) count++;
			n/=2;
		}
		return count;
	}

	public static int base16(int n){
		int count = 0;
		while(n>0){
			int temp = n%10;
			n/=10;
			while(temp>0){
				if(temp%2==1) count++;
				temp/=2;
			}
		}
		return count;
	}
}