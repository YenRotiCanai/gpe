//找出有多少個 '1'

import java.util.*;

class p10461 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	if(n==0) break;

        	//直接轉成 2 進制
        	String st = Integer.toBinaryString(n);

        	int count = 0;
        	for(int i=0; i<st.length(); i++){
        		if(st.charAt(i) == '1') count++;
        	}

        	System.out.println("The parity of " + st + " is " + count + " (mod 2).");
        }
    }
}