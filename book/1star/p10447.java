import java.util.Scanner;

public class p10447 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=1; i<=cases; i++){
			
			int x1 = sc.nextInt(), y1 = sc.nextInt();
			int x2 = sc.nextInt(), y2 = sc.nextInt();

			long pos1, pos2;

			pos1 = (x1+y1+1)*(x1+y1)/2+x1;
			pos2 = (x2+y2+1)*(x2+y2)/2+x2;

			System.out.println("Case "+i+": "+(pos2-pos1));
		}
	}
}