import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		String s1 = sc.nextLine();
		String s2 = "";

		for(int i=0; i<s1.length(); i++){
			int a = s1.charAt(i)-97;
			int b = (a+n)%26;
			char c = (char)(b+97);
			s2+=c;

			//System.out.printf("i:%d, a:%d, b:%d, c:%c, s2:%s%n",i,a,b,c,s2);
		}

		System.out.println(s2);
	}
}