import java.util.Scanner;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	long a = sc.nextLong();
        	long b = sc.nextLong();

        	System.out.print(a+" "+b+" ");

        	if(a>b){
        		long c = a;
        		a = b;
        		b = c;
        	}

        	long maxLen = 0;
        	for(long k=a; k<=b; k++){
        		long n = k;
        		long len = 1;

        		while(true){
        			if(n==1) break;
        			if(n%2==1) n = 3*n+1;
        			else n /= 2;

        			len++;
        		}

        		//if(len>maxLen) maxLen = len;

        		maxLen = Math.max(maxLen, len);
        	}

        	System.out.println(maxLen);
        	
        }
	}
}