import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./   ";
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		for(int i=2; i<str.length(); i++){
			hm.put(str.charAt(i), str.charAt(i-2));
		}
		
		while(sc.hasNext()){
			String s1 = sc.nextLine().toLowerCase();
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<s1.length(); i++){
				char c = s1.charAt(i);
				sb.append(hm.get(c));
			}
			System.out.println(sb);
		}
	}
}