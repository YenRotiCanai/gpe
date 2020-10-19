//http://hellowalk.blogspot.com/2018/10/java-uva-10226-hardwood-species.html

import java.util.*;

class p10426{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.valueOf(sc.nextLine());
		sc.nextLine();
		boolean newLine = false;

		while(n-->0){
			if(newLine) System.out.println();

			float total = 0.0f;
			HashMap<String, Integer> hm = new HashMap<String,Integer>();
			ArrayList<String> tree = new ArrayList<String>();
			String input;

			while(sc.hasNext()){
				input = sc.nextLine();
				if(input.length()==0) break;

				if(!hm.containsKey(input)){
					hm.put(input,1);
					tree.add(input);
				}else hm.put(input, hm.get(input)+1);

				total++;
			}
			Collections.sort(tree);

			for(String s:tree) System.out.printf("%s %.4f%n",s, (float)hm.get(s)/total * 100);

			newLine = true;
		}
	}
}