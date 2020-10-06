import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			long a = sc.nextLong();
			long b = sc.nextLong();

			//long ans = Math.abs(a-b); //其實可以不用宣告多一個來放 ans，直接寫在 output 裡面就可以了
			System.out.println(Math.abs(a-b));
		}
	}
}