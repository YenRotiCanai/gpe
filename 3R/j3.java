import java.util.*;

class j3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Try");

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;	
			
			System.out.println(n+10);
		}
	}
}