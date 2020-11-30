//https://blog.xuite.net/b81621java/blog/85307618-22131%3A+TeX+Quotes

import java.util.*;

class p22131 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean first = true;

        while(sc.hasNext()){
        	String str = sc.nextLine();
        	while(str.contains("\"")){
        		if(first) str=str.replaceFirst("\"","``");
        		else str=str.replaceFirst("\"","''");
        		first = !first;
        	}
        	System.out.println(str);
        }
    }
}