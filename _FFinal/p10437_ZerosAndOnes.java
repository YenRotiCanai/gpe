////https://a7069810.pixnet.net/blog/post/392080000-%5Buva10324%5D-zeros-and-ones

import java.util.*;

class p22131 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cases = 1;

        while(sc.hasNext()){
        	System.out.println("Case "+cases+":");
        	String str = sc.next(); //不能用 nextline
        	int n = sc.nextInt();

        	while(n-->0){
        		int a = sc.nextInt();
        		int b =  sc.nextInt();

        		if(a>b){
        			int tmp = a;
        			a = b;
        			b = tmp;
        		}

        		boolean same = true;
        		for(int i=a; i<b; i++){
        			if(str.charAt(a) != str.charAt(i+1)){
        				same = false;
        				break;
        			}
        		}

        		if(same) System.out.println("Yes");
        		else System.out.println("No");
        	}
        	cases++;
        }
    }
}