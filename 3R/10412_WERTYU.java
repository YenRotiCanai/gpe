//https://blog.xuite.net/b81621java/blog/138198936
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		for(int i=1; i<str.length(); i++){
			hm.put(str.charAt(i), str.charAt(i-1));
		}
		
		while(sc.hasNext()){
			String s1 = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<s1.length(); i++){
				char c = s1.charAt(i);
				if(c == ' ') sb.append(' ');
				else sb.append(hm.get(c));
			}
			System.out.println(sb);
		}
	}
}