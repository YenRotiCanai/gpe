import java.util.Scanner;

class p11067{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			double b = a*1.5;
			System.out.println((int)b);
		}
	}
}