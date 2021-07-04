import java.util.*;

class Main{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int max_count = 0;
            System.out.print(a + " " + b + " ");

            if(a>b){ long c = a; a = b; b = c;}

            for(long i=a; i<=b; i++){
                long n = i;
                int len = 1;
                while(true){
                    if(n == 1) break;
                    if(n%2==0) n/=2;
                    else n = n*3+1;

                    len++;
                }
                max_count = Math.max(max_count,  len);
            }

            System.out.println(max_count);
        }
    }
}