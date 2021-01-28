//10400:The 3n + 1 problem
//3n+1計算的最大次數（長度），要用long
//1. 先確保 a < b，不然就把他們對調
//2. 宣告一個 maxLen
//3. 開for，裡面另外宣告一個 n 來放 i 的值，還有一個 len 來記錄長度
//4. 開while true，如果 n 是 1，break；如果 n 是奇數（mod2 == 1）n=3n+1，不然他就是偶數，n/=2
//5. len ++
//6. 最後用 Math.max 來找最長的那個就是答案了

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