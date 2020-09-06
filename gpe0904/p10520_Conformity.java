//https://github.com/nanda-thant-sin/UVA-solutions/blob/master/11286%C2%A0-%C2%A0Conformity.java
//http://rubyacm.blogspot.com/2011/12/11286-conformity.html


import java.util.Scanner;
import java.util.Arrays;

class p10520_Conformity {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int t = sc.nextInt(); //no. of cases
            if(t == 0) break;

            long[] abc = new long[t];
            for(int i=0; i<t; i++){
                int a[] = new int[5]; // 每個人的課程組合
                for(int j=0; j<5; j++){
                    a[j] = sc.nextInt(); // 課程編號
                    //System.out.println(Arrays.toString(a));
                }
                Arrays.sort(a);
                //System.out.println("Arrays:");
                //System.out.println(Arrays.toString(a));
                long c=0;
                for(int j=0; j<5; j++){
                    c = c*1000 + a[j]; //為什麼這裡要*1000？因為要把他們全部串起來，每個人的課程組合全部串起來變成一組數字
                    //System.out.printf("c: %d%n",c);
                }
                abc[i] = c;
            }

            Arrays.sort(abc);

            System.out.println(Arrays.toString(abc));

            long curr = abc[0]; //把第一個給 curr
            int count = 1;
            int maxcount = 0;
            int ans = 0;
            for(int i=1; i<t; i++){

                System.out.printf("curr: %d, abc[%d]: %d%n",curr,i,abc[i]);

                System.out.printf("count: %d, maxcount: %d, ans: %d%n",count,maxcount,ans);

                if(curr == abc[i]) {
                    System.out.println("True");
                    count++; //如果有兩個是一樣的，count ++
                } 
                else{
                    System.out.println("False");

                    curr = abc[i]; //不然的話就當下的 abc 給 curr
                    
                    //如果次數和最大次數一樣，ans就加上現在的次數
                    //如果最大次數小於次數，就把 ans 和 maxcount 都設成和次數一樣
                    if(maxcount == count) ans+=count; 
                    else if(maxcount < count){ 
                        ans = count;
                        maxcount = count;
                    }

                    System.out.printf("false, count: %d, maxcount: %d, ans: %d%n",count,maxcount,ans);

                    count = 1; //重設 count
                }
                System.out.println();
            }
            if(maxcount == count) ans += count;
            else if(maxcount < count) ans = count;

            System.out.println(ans);
        }
    }
}