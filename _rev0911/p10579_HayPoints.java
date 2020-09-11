import java.util.*;

class p10579{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			HashMap<String,Integer> hm = new HashMap<String,Integer>();

			int m=sc.nextInt();
			int n=sc.nextInt();

			for(int i=0; i<m; i++){
				hm.put(sc.next(), sc.nextInt());
			}

			for(int j=0; j<n; j++){
				String str;
				int sum=0;
				while(!(str = sc.next()).equals(".")){
					if(hm.containsKey(str)){
						sum += hm.get(str);
					}
				}
				System.out.println(sum);
			}
		}
	}
}