//https://blog.xuite.net/b81621java/blog/175566184-11020%3A+Eb+Alto+Saxophone+Player%09
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//先建表格
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

		//把表格裡面的東西對應到 hashmap 裡面, 每一個音符會對到一個一維的陣列
		HashMap<Character, int[]> fingers = new HashMap<Character, int[]>();
		fingers.put('c',table[0]);
		fingers.put('d',table[1]);
		fingers.put('e',table[2]);
		fingers.put('f',table[3]);
		fingers.put('g',table[4]);
		fingers.put('a',table[5]);
		fingers.put('b',table[6]);
		fingers.put('C',table[7]);
		fingers.put('D',table[8]);
		fingers.put('E',table[9]);
		fingers.put('F',table[10]);
		fingers.put('G',table[11]);
		fingers.put('A',table[12]);
		fingers.put('B',table[13]);

		int n = sc.nextInt();
		sc.nextLine(); //強制換行

		while(n-->0){
			//一個音最多可以按 10 個手指，所以陣列開10個
			int count[] = new int[10];
			int cur[] = new int[10]; //用來存目前按著的手指
			String str = sc.nextLine(); //整行吃進來

			for(int i=0; i<str.length(); i++){
				//測資音符的指法
				int next[] = fingers.get(str.charAt(i));

				for(int j=0; j<10; j++){
					//如果 current 小於 next 的話：例如 0<1 就代表他原本是沒按著的，所以接下來要按，count 就 +1
					if(cur[j] < next[j]) count[j]++;

					//不管有沒有按，都要把 current 換成測資的指法
					cur[j] = next[j];
				}
			}

			//因為輸出要求每一個前面都要空，唯獨第一個不用，所以在宣告的時候直接把第一個先加進來
			StringBuilder sb = new StringBuilder(count[0]+"");

			for(int i=1; i<10; i++) sb.append(" "+count[i]);

			System.out.println(sb);
		}
	}
}