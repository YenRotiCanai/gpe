//http://hellowalk.blogspot.com/2017/12/java-uva-10193-all-you-need-is-love.html

import java.util.*;

class p10421 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        int s1, s2;

        for(int i=1; i<=n; i++){

        	//用 Integer.parseInt(sc , 2) 來回傳 2 進制的 int
        	s1 = Integer.parseInt(sc.nextLine(),2);
        	s2 = Integer.parseInt(sc.nextLine(),2);

        	//輾轉相除法
        	int tmp;
        	while(s2>0){
        		tmp = s1%s2;
        		s1 = s2;
        		s2 = tmp;
        	}

        	//如果 s1 是 1 以外的數字，代表有其他公因數
        	if(s1 > 1) System.out.println("Pair #" + i + ": All you need is love!");
			else System.out.println("Pair #" + i + ": Love is not all you need!");
        }
    }
}