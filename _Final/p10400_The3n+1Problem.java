//10400:The 3n + 1 problem
// 要用long

import java.util.*;

class p10400_3n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	long a = sc.nextLong();
        	long b = sc.nextLong();

        	System.out.print(a+" "+b+" ");

        	if(a>b){
        		long c = a; a = b; b = c;
        	}

        	long maxLen = 0;
        	for(long i=a; i<=b; i++){
        		long n = i, len = 1;

        		while(true){
        			if(n==1) break;
        			if(n%2==1) n=3*n+1;
        			else n/=2;

        			len++;
        		}
        		maxLen = Math.max(maxLen, len);
        	}
        	System.out.println(maxLen);
        }
    }
}