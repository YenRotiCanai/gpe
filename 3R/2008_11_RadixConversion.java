//進制轉換
//給一長串數字，把他轉換成對應的 base
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Character> hm = new HashMap<Integer,Character>();

		//先把對應的 base 放進 hashmap
		int idx = 10;
		for(char c= 'A'; c<='Z'; c++){
			hm.put(idx, c);
			idx++;
		}

		//System.out.println(hm);

		while(sc.hasNext()){
			long n = sc.nextLong();
			if(n==-1) break;
			int m = sc.nextInt();
			

			StringBuilder sb = new StringBuilder();

			//轉換時一直 mod base，直到他小於 0
			while(n>0){
				long rem = n%m;

				//如果他小於10，就直接放進 sb
				//不然，就去hashmap抓
				if(rem>=0 && rem < 10) sb.insert(0, rem);
				else{
					sb.insert(0, hm.get((int)rem));
				}

				//mod 了之後要記得除
				n/=m;
			}
			System.out.println(sb);
		}
	}
}