//http://hellowalk.blogspot.com/2018/10/java-uva-10268-498-bis.html
//這裡用 parseInt 或是 valueOf 都可以
import java.util.*;

class p10431 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	long x = Integer.parseInt(sc.nextLine());

        	// \\s 代表有一個空格，+表示可能為 1～多個，所以下面這表示符合1～多個就切開
        	String s[] = sc.nextLine().split("\\s+");

        	long sum = 0;
        	if(s.length == 1) System.out.println(0);
        	else{
        		long pow = 1;
        		for(int i=1; i<s.length; i++, pow *= x){
        			sum += i * pow * Integer.parseInt(s[s.length-i-1]);
        		}
        		System.out.println(sum);
        	}
        }
    }
}