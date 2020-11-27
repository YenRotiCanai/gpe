//https://blog.xuite.net/b81621java/blog/141035491-21924%3A+List+of+Conquests
//https://a7069810.pixnet.net/blog/post/392084056-%5Buva10420%5D-list-of-conquests

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

class p21924 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

        for(int i=0; i<n; i++){
        	String s = sc.next();
        	sc.nextLine();

        	//如果 tm 裡面原本就有 s 了， 那就把 s 的值+1，再 put 上去
			//不然的話就直接 put 上去
        	if(tm.containsKey(s)) tm.put(s, tm.get(s)+1);
        	else tm.put(s,1);
        }

        //用 entrySet 把 tm 變成 set
        //再來用 Entry 來把他取出來
        for( Entry<String, Integer> entry : tm.entrySet()){
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}