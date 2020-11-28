//https://blog.xuite.net/b81621java/blog/144453046-10454%3A+Beat+the+Spread%21L

import java.util.*;

class p10454 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        while(n-->0){
        	long s = sc.nextLong();
        	long d = sc.nextLong();
        	long b = s - d;

        	if(b>=0 && b%2==0){
        		b /= 2;
        		System.out.println(s-b + " " +b);
        	}else{
        		System.out.println("impossible");
        	}
        }
    }
}