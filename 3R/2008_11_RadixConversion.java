import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Character> hm = new HashMap<Integer,Character>();
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

			while(n>0){
				long rem = n%m;
				if(rem>=0 && rem < 10) sb.insert(0, rem);
				else{
					sb.insert(0, hm.get((int)rem));
				}

				n/=m;
			}
			System.out.println(sb);
		}
	}
}