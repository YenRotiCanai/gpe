import java.util.*;

// public class Main{
// 	public static void main(String[] args){
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		String s = sc.next();

// 		StringBuilder sb = new StringBuilder();

// 		for(int i=0; i<s.length(); i++){
// 			int m = (int)s.charAt(i) + n;

// 			char c = (char)m;

// 			if(c>'z') {
// 				c = (char)(c-26);
// 			}
// 			sb.append(c);
// 		}
// 		System.out.println(sb.toString());		
// 	}
// }


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		String s1 = sc.nextLine();
		String s2 = "";

		for(int i=0; i<s1.length(); i++){

			char c = (char)(s1.charAt(i)-'a');
			System.out.println(c);
			c = (char)((c+n)%26);
			s2+=c+97;
			
		}
		System.out.println(s2);		
			int a = s1.charAt(i)-97;
			int b = (a+n)%26;
			char c = (char)(b+97);
			s2+=c;

			//System.out.printf("i:%d, a:%d, b:%d, c:%c, s2:%s%n",i,a,b,c,s2);
		

		System.out.println(s2);
	}
}