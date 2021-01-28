//http://hellowalk.blogspot.com/2018/10/java-uva-10226-hardwood-species.html

import java.util.*;

class p10426 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        boolean first = true;

        while(n-->0){
        	if(!first) System.out.println();

        	float total = 0.0f;

        	HashMap<String, Integer> hm = new HashMap<String, Integer>();
        	ArrayList<String> tree = new ArrayList<String>();

        	while(sc.hasNext()){
        		String input = sc.nextLine();
        		if(input.length()==0) break;

        		//if(input.equals("X")) break;

        		if(!hm.containsKey(input)){
        			hm.put(input, 1);
        			tree.add(input);
        		}else hm.put(input,hm.get(input)+1);

        		total++;
        	}
        	Collections.sort(tree);

        	for(String s:tree) System.out.printf("%s %.4f%n", s, (float)hm.get(s)/total*100);

        	first = false;

        }
    }
}