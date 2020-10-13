//http://kpeggy.blogspot.com/2013/07/javasumming-digits.html

import java.util.Scanner;

class p10473{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s;
		char a;

		while(sc.hasNext()){
			s = sc.next();
			if(s.equals("0")) break;

			while(s.length()>1){

				int b, count=0;

				for(int i=0; i<s.length(); i++){
					a = s.charAt(i);
					b = a - '0';
					count += b;
				}
				s = Integer.toString(count);
			}
			System.out.println(s);
		}
	}
}