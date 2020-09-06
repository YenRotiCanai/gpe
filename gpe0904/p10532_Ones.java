//http://kpeggy.blogspot.com/2014/04/java-ones.html
//書本228

import java.util.Scanner;

class p10532{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int sum = 1;
			int count = 1;
			int n = sc.nextInt();

			while(sum % n != 0){
				count ++;
				sum = (sum*10+1)%n;
			}
			System.out.println(count);
		}
	}
}