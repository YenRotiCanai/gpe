//https://a7069810.pixnet.net/blog/post/391634755-%5Buva10994%5D-simple-addition

import java.util.Scanner;

public class p10463_SimpleAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long p=0, q=0;
        while(sc.hasNext() && (p=sc.nextLong())>=0 && (q=sc.nextLong())>=0){
            long sum=0;
            p--;

            //計算 sum-1 ~ (p-1)的總和
            while(p>0){
                sum = sum - (p/10)*45 - (p%10+1) * (p%10)/2;
                p/=10;
            }

            while(q>0){
                sum = sum + (q/10)*45 + (q%10+1) * (q%10)/2;
                q/=10;
            }
            System.out.println(sum);
        }
    }
}
