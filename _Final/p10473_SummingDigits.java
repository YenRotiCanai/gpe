//10473:Summing Digits
//http://kpeggy.blogspot.com/2013/07/javasumming-digits.html

import java.util.*;

class p10473 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){

        	String s = sc.next();
        	
        	if(s.equals("0")) break;

        	char a;
        	
        	//題目要求答案是 1 位數，所以只要他還沒到 1 位數，就一直做下去
        	while(s.length()>1){

        		int tmp, count = 0;

        		//把數字單獨取出來，把他從字元變回數字，再加進去 count 裡面
        		for(int i=0; i<s.length(); i++){
        			a = s.charAt(i);
        			tmp = a-'0';
        			count += tmp;
        		}

        		//做完一輪後，把 count 變回字串，再跑一次
        		s = Integer.toString(count);
        	}

        	System.out.println(s);
        }
    }
}