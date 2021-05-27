//比高低，比 now 高就 up++，比 now 低就 down++
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for(int k=1; k<=cases; k++){
			int n = sc.nextInt();
			int up = 0, down = 0;

			int now = sc.nextInt();
			//System.out.println(now);
			for(int i=0; i<n-1; i++){
				int next = sc.nextInt();
				//System.out.println(next);
				if(now > next) down++;
				else if(now < next) up++;

				now = next;
			}

			System.out.printf("Case %d: %d %d\n", k, up, down);
		}

	}
}