//https://a7069810.pixnet.net/blog/post/391634755-%5Buva10994%5D-simple-addition

import java.util.Scanner;

class uva10994{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        long p=0,q=0;
        while(sc.hasNext() && (p=sc.nextLong())>=0 && (q=sc.nextLong())>=0){
            long sum=0;
            p--;
            //計算sum-1~(p-1)的總和
            while(p>0){
              /*
                1. 1+2+3+...+9=45。
                2. 1+2+...+n=n*(n+1)/2 ps.可以想成1+2+...+n會有幾個n，剛好會是(n+1)/2個。
                3. 除10(有多少10的倍數)，取10餘數(剩下的數字)。
                4. 當數字小於0終止迴圈。
                Ex p=1 q=214
              */
                sum=sum-(p/10)*45-(p%10+1)*(p%10)/2; 
                p=p/10;
            }
            
            //計算sum+1~q的總和
            while(q>0){
                sum=sum+(q/10)*45+(q%10+1)*(q%10)/2;
                q=q/10;
            }
            
            //結果輸出
            System.out.println(sum);
        }
    }
}