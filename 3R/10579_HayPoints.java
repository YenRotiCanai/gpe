import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();

            //建 hashmap 來存測資
			HashMap<String, Integer> hm = new HashMap<String, Integer>();

			for(int i=0; i<m; i++){
				hm.put(sc.next(), sc.nextInt());
			}

			for(int i=0; i<n; i++){
				String str;
				int total = 0;
				while(true){
					str = sc.next();
					if(str.equals(".")) break;
                    //從 hashmap 裡面抓測資的 int 出來加總
					if(hm.containsKey(str)) total += hm.get(str);
				}
				System.out.println(total);
			}
		}
	}
}