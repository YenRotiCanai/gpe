//https://a7069810.pixnet.net/blog/post/393000298-%5Buva10415%5D-eb-alto-saxophone-player
//TimeLimit

//https://blog.xuite.net/b81621java/blog/175566184-11020%3A+Eb+Alto+Saxophone+Player%09
//Accepted

import java.util.HashMap;
import java.util.Scanner;

class p11020{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int table[][] = {
			{0,1,1,1,0,0,1,1,1,1},
			{0,1,1,1,0,0,1,1,1,0},
		    {0,1,1,1,0,0,1,1,0,0},
		    {0,1,1,1,0,0,1,0,0,0},
		    {0,1,1,1,0,0,0,0,0,0},
			{0,1,1,0,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,0,0,0},
			{0,0,1,0,0,0,0,0,0,0},
			{1,1,1,1,0,0,1,1,1,0},
			{1,1,1,1,0,0,1,1,0,0},
			{1,1,1,1,0,0,1,0,0,0},
			{1,1,1,1,0,0,0,0,0,0},
			{1,1,1,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
		};

		HashMap<Character, int[]> fingers = new HashMap<Character, int[]>();
		fingers.put('c', table[0]);
		fingers.put('d', table[1]);
		fingers.put('e', table[2]);
		fingers.put('f', table[3]);
		fingers.put('g', table[4]);
		fingers.put('a', table[5]);
		fingers.put('b', table[6]);
		fingers.put('C', table[7]);
		fingers.put('D', table[8]);
		fingers.put('E', table[9]);
		fingers.put('F', table[10]);
		fingers.put('G', table[11]);
		fingers.put('A', table[12]);
		fingers.put('B', table[13]);

		while(sc.hasNext()){
			int n = sc.nextInt();
			sc.nextLine();

			for(int i=0; i<n; i++){
				int count[] = new int[10];
				int now[] = new int[10];
				String str = sc.nextLine();

				for(int j=0; j<str.length(); j++){
					int press[] = fingers.get(str.charAt(j));
					for(int k=0; k<10; k++){
						count[k] += (now[k] < press[k]?1:0);
						now[k] = press[k];
					}
				}

				StringBuilder sb = new StringBuilder(count[0]+"");
				for(int j=1; j<10; j++){
					sb.append(" "+count[j]);
				}
				System.out.println(sb);
			}
		}
	}
}