import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		
		sc.nextLine();
		boolean first=true;

		while(n-->0){
			if(!first) System.out.println();

			HashMap<String,Integer> hm = new HashMap<String,Integer>();
			ArrayList<String> arrlist = new ArrayList<String>();

			float total = 0.0f;

			while(sc.hasNext()){
				String str = sc.nextLine();

				if(str.length() == 0) break;

				//檢查看裡面是不是已經有 key 了，如果有的話，就把它的撈出來 +1
				//沒有的話，就把它加進去
				if(hm.containsKey(str)){
					hm.put(str, hm.get(str)+1);
				}else{
					hm.put(str,1);
					arrlist.add(str);
				}

				total++;
			}

			Collections.sort(arrlist);

			for(String s:arrlist) System.out.printf("%s %.4f%n", s, (float)hm.get(s)/total*100);

			first = false;
		}
	}
}