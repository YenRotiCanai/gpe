import java.util.Scanner;

public class UVa10642_CanYouSolveIt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i <= n; ++i) 
		{
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int dis = originToPoint(x2, y2) - originToPoint(x1, y1);
			System.out.printf("Case %d: %d\n", i, dis);
		}
	}
	static int originToPoint(int x, int y) 
	{
		int s = x + y;
		return (1+s) * s / 2 + x; 
	}
}