//求公因數(Common Factor)，如果只有1和自己，就是 'All you need is love!'
//反之，若還有其他公因數，就是 'Love is not all you need!'
//http://hellowalk.blogspot.com/2017/12/java-uva-10193-all-you-need-is-love.html

import java.util.Scanner;

class All{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int s1, s2;

        for(int i=1; i<=n; i++){
            s1 = Integer.parseInt(sc.nextLine(),2);
            s2 = Integer.parseInt(sc.nextLine(),2);

            // System.out.println("s1: "+s1);
            // System.out.println("s2: "+s2);

            int tmp;

            while(s2>0){
                tmp = s1 % s2;
                s1 = s2;
                s2 = tmp;
            }
            
            // System.out.println("s1: "+s1);
            // System.out.println("s2: "+s2);

            if(s1>1){
                System.out.println("Pair #"+i+": All you need is love!");
            }else{
                System.out.println("Pair #"+i+": Love is not all you need!");
            }
            
        }
    }
}