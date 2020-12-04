import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while(n-->0){
			int x1=sc.nextInt(), y1=sc.nextInt();
			int x2=sc.nextInt(), y2=sc.nextInt();

			double distance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));

			System.out.printf("%.2f%n",distance);
		}
	}
}