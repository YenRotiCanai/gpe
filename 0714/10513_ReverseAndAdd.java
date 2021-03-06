import java.util.*;

class Main{

    //宣告一個 func 用來反轉數字，把 x 以 long 的型態吃進來
    public static long Reverse(long x){

        //如果只有個位數（也就是<10)，直接吐回去，不用反轉
        if(x < 10) return x;
        else{

            //先弄一個值為 0 的變數，跑完第一次之後就會有值了
            long input = x, result = 0;

            while(input > 0){
                //這裏重要！ (RESULT*10)+(INPUT*10) 
                result = (result * 10) + (input % 10);

                //用除10的方式拿掉他一個位數
                input /= 10;
            }
            return result;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long cases = sc.nextInt();

        while(cases-->0){
            long N = sc.nextLong();
            long count = 1;

            //做第一次的反轉和加總
            N = N + Reverse(N);

            //把第一加總後的再丟回去反轉，然後看是不是一樣，如果不一樣就一直丟，還要把丟的次數加起來
            while(Reverse(N) != N){
                N = N + Reverse(N);
                count ++;
            }

            System.out.println(count + " " + N);
        }
        
    }
}