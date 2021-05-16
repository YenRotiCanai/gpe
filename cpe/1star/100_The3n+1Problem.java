import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int maxLen = 0;

            System.out.printf("%d %d ", a, b);
            if(a > b){
                long tmp = a;
                a = b;
                b = tmp;
            }

            for(long i = a; i<=b; i++){
                maxLen = Math.max(maxLen, calc(i));
            }
            System.out.println(maxLen);
        }
    }

    public static int calc(long n){
        int count = 1;
        while(n>1){
            if(n%2==0) n/=2;
            else n = 3 * n + 1;

            count++;
        }
        return count;
    }
}