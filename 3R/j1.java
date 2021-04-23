import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();

			int x = 0;
			int y = 1;
			int prev_x = 1;
			int prev_y = 0;

			while(b!=0){
				int q = a/b;

				int tmp = b;
				b = a;
				a = tmp;

				int next_x = prev_x - q * x;
				prev_x = x;
				x = next_x;

				int next_y = prev_y - q * y;
				prev_y = y;
				y = next_y;
			}

			System.out.println(prev_x + " " + prev_y + " " + a);

		}
		
	}
}