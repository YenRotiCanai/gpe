import java.util.Scanner;

class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();

			System.out.println((int)(n*1.5));			
		}
	}
}