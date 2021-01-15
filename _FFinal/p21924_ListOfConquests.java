import java.util.Scanner;
import java.util.Map.Entry;
import java.util.TreeMap;

class FFtest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		int n = sc.nextInt();

		while(n-->0){
			String s = sc.next();
			sc.nextLine();

			if(tm.containsKey(s)) tm.put(s, tm.get(s)+1); //如果裡面原本就有，就用get把他拿出來+1
			else tm.put(s,1); //如果裡面沒有，就put 1 上去
		}

		//用 entry 來拿裡面的值出來
		for(Entry<String, Integer> entry : tm.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
}