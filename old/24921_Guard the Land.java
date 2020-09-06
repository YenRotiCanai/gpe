import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
		int cases = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for(int night = 1; night<=cases; night++){
			int ax = sc.nextInt();
			int ay = sc.nextInt();
			int bx = sc.nextInt();
			int by = sc.nextInt();
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			int dx = sc.nextInt();
			int dy = sc.nextInt();
			//System.out.println(ax +" "+ cx +" "+ dy);
			int i = Math.max(ax, cx);
			int j = Math.max(ay, cy);
			int k = Math.min(bx, dx);
			int l = Math.min(by, dy);

			int Strongg = (k-i)*(l-j);
			if(i>k || j>l) Strongg = 0; //如果兩個沒有交集，就沒有Strong
			int weakk = (bx-ax)*(by-ay)+(dx-cx)*(dy-cy) - 2*Strongg;
			int Out = 100 * 100 - weakk - Strongg;

			System.out.println("Night "+night+": "+Strongg+" "+weakk+" "+Out);

			// sb.append(String.format("Night %d: %d %d %d\n", night, Strongg, weakk, Out));
			// System.out.println(sb);
		}
		
	}
  }
}