import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			boolean field[][] = new boolean[W+1][H+1];
			
			int N = sc.nextInt();
			
			if (W == 0 && H == 0 && N == 0)
				break;

			while (N-- > 0) {
				int a1 = sc.nextInt();
				int a2 = sc.nextInt();
				int b1 = sc.nextInt();
				int b2 = sc.nextInt();
				
				for (int i = Math.min(a1, b1); i <= Math.max(a1, b1); i++) {
					for (int j = Math.min(a2, b2); j <= Math.max(a2, b2); j++) 
						field[i][j] = true;
				}
			}
			
			int count = 0;
			for (int i = 1; i <= W; i++)
				for (int j = 1; j <= H; j++)
					if (!field[i][j])
						count++;
			
			if (count == 0)
				System.out.println("There is no empty spots.");
			else if (count == 1)
				System.out.println("There is one empty spot.");
			else
				System.out.println("There are " + count +" empty spots.");
		}
		
	}
}