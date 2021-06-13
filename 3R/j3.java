import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = "abcde";
		String s1 = str.substring(str.length()-2, str.length());

		System.out.println(s1);
	}
}