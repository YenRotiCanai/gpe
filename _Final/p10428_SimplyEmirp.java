//p10428_SimplyEmirp

import java.util.Scanner;

class p10428 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	if(prime(n)){
        		StringBuilder sb = new StringBuilder(n+"");
        		sb.reverse();

        		int rn = Integer.parseInt(sb.toString());

        		if(rn==n) System.out.println(n+" is prime.");
        		else{
        			if(prime(rn)) System.out.println(n+" is emirp.");
        			else System.out.println(n+" is prime.");
        		}
        	}else{
        		System.out.println(n+" is not prime.");
        	}
        }
    }

    static boolean prime(int n){
    	int sqn = (int)Math.sqrt(n);
    	for(int i=2; i<=sqn; i++){
    		if(n%i==0) return false;
    	}
    	return true;
    }
}