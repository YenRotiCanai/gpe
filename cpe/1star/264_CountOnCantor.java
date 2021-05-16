//https://a7069810.pixnet.net/blog/post/392203432-%5Buva264%5D-count-on-cantor

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();

            //先算出他在那一個區間裡
            int i = 1;
            int sum = 0;
            while(sum < n){
                sum += i;
                i++;
            }
            i--; // i 在while裡面會多做一次，所以要減 1

            //n 和最後一個數字的位子差
            int change = sum - n;

            System.out.println("i:"+i+", sum:"+sum+", change:"+change);

            /*
            舉例：
            
 1	      2	           3	            4	                5
1/1	｜ 1/2 2/1	｜ 3/1 2/2 1/3 ｜ 1/4 2/3 3/2 4/1 ｜ 5/1 4/2 3/3 2/4 1/5

            看上面的表格可以發現，
            只要區間是偶數，分子是從小到大，分母從大到小，而奇數是相反

            input：14，output： 2/4
            經過上面迴圈算出來，第 14 位是在 10-15 中間，也就是到第5區的時候
            所以 14 在 第5區，5 是奇數，i：5
            14 和 15 相差 1，change：1

            接下來就不是很懂了
            奇數：分子/分母 = (1+change) / (i-change)
            偶數：分子/分母 = (i-change) / (1+change)

            */

            //如果是偶數，會從小排到大，所以分子先放
            //如果是奇數，是從大排到小
            if(i%2==0) System.out.println("TERM "+n+" IS "+(i-change)+"/"+(1+change));
            else System.out.println("TERM "+n+" IS "+(1+change)+"/"+(i-change));

            System.out.println();
        }
    }
}