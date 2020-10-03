import java.util.*;

class p10406{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();

			if(s.equals("0")) break;

			int odd=0, even=0;
			for(int i=0; i<s.length(); i++){
				if(i%2==0) even+=s.charAt(i)-48;
				else odd+=s.charAt(i)-48;
			}

			if((odd-even)%11 == 0){
				System.out.printf("%s is a multiple of 11.\n", s);
			}else{
				System.out.printf("%s is not a multiple of 11.\n", s);
			}
		}
	}
}