//https://blog.xuite.net/b81621java/blog/85307618-22131%3A+TeX+Quotes

import java.util.Scanner;

class p22131{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean backquote = true;

		while(sc.hasNext()){
			String str = sc.nextLine();
			while(str.contains("\"")){
				if(backquote) str = str.replaceFirst("\"","``");
				else str = str.replaceFirst("\"","''");
				backquote = !backquote;
			}
			System.out.println(str);
		}
	}
}