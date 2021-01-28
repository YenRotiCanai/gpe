import java.util.*;
import java.util.TreeMap;
import java.util.Map.Entry;

class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str, tmp;
		TreeMap<String, Integer> country = new TreeMap<String, Integer>();

		int n = sc.nextInt();

		while(n-->0){
			str = sc.next();
			tmp = sc.nextLine();

			if(country.containsKey(str)){
				country.put(str, country.get(str)+1);
			}else{
				country.put(str, 1);
			}
		}

		for(Entry<String,Integer> entry: country.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}