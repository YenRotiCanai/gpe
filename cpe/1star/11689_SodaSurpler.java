import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int e = sc.nextInt();
            int f = sc.nextInt();
            int c = sc.nextInt();

            int total = 0;
            int own = e+f; //一開始持有的空瓶

            //當他有的空瓶數量 >= 需要的數量時
            while(own >= c){
                //先直接用除的找出他可以換多少
                total += own/c;

                //然後再來算接下來可以換多少
                //如果可以整除的話，就直接整除
                if(own % c == 0){
                    own /= c;
                }else{
                    //算出換好的和剩下的，再加起來
                    //假設他換好後會直接喝，馬上又變空瓶，所以直接加起來
                    int tmp = own/c;
                    int left = own - tmp * c;
                    own = left + tmp;
                }
            }
            System.out.println(total);
        }
    }
}