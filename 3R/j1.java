import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s1 = sc.nextLine().toLowerCase();
			String s2 = sc.nextLine().toLowerCase();

			int x = 0, y = 0;

			for(int i=0; i<s1.length(); i++){
				char c = s1.charAt(i);
				if(c >='a' && c <= 'z') x += c - 'a' +1;
				//System.out.printf("c:%c, value:%d, x:%d\n", c, c-'a', x);
			}

			for(int i=0; i<s2.length(); i++){
				char c = s2.charAt(i);
				if(c >='a' && c <= 'z') y += c - 'a' +1;
				//System.out.println("y:"+y);
			}
			//System.out.println(x + " " + y);

			x = calc(x);
			y = calc(y);

			//System.out.println(x + " " + y);

			if(x>y){
				int tmp = x;
				x = y;
				y = tmp;
			}

			float ans = (float)x / (float)y * 100f;

			System.out.printf("%.2f %%\n", ans);
		}
	}

	static int calc(int n){
		while(n>9){
			int total = 0;

			while(n>0){
				total += n%10;
				n/=10;
			}
			n = total;
		}
		return n;
	}
}