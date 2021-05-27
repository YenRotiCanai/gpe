//直接按照公式寫，不用建表
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;

			System.out.printf("f91(%d) = %d\n", n, f91(n));
		}
	}

	static int f91(int n){
		if(n<=100) return f91(f91(n + 11));
		else return n - 10;
	}
}