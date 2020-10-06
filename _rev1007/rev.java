import java.util.*;

class rev{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long a = sc.nextLong();
			if(a==0) break;
			long b = (long)Math.sqrt(a);

			if(b*b == a) System.out.println("yes");
			else System.out.println("no");
		}
	}
}