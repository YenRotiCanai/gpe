//https://blog.xuite.net/b81621java/blog/175566184-11020%3A+Eb+Alto+Saxophone+Player%09
import java.util.Scanner;
import java.util.HashMap;

class p11020 {
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

		//把表格裡面的東西對應到 hashmap 裡面
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

		while(sc.hasNext()){
			int n = sc.nextInt();
			sc.nextLine(); //強制換行

			while(n-->0){

				//一個音最多可以按10個手指
				int count[] = new int[10];
				int now[] = new int[10];
				String str = sc.nextLine();

				//找到現在按到的位置
				for(int j=0; j<str.length(); j++){
					int press[] = fingers.get(str.charAt(j));

					//統計該位置的次數
					for(int k=0; k<10; k++){

						//判斷他現在是不是已經按著了，如果 n<p 的話，就代表（0<1），也就是說現在並沒有按著，所以要按，count 就 +1
						//反之，如果（1<1 or 1<0)，已經按著了的話就條件不成立，count + 0
						count[k] += (now[k]<press[k]? 1:0);

						//之後把按下的動作交給當下的
						now[k] = press[k];
					}
				}

				StringBuilder sb = new StringBuilder(count[0]+"");

				for(int j=1; j<10; j++) sb.append(" "+count[j]);

				System.out.println(sb);
			}
		}
    }
}