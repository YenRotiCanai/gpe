import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            long n = sc.nextLong();
            if(n==0) break;
            long m = (long)Math.sqrt(n);

            System.out.println(m*m == n? "yes":"no");
        }
	}
}