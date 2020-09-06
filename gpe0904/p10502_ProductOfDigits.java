import java.util.*;

class p10502{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        while(cases-->0){
            long n = sc.nextLong(); //這裡要用 long，因為測資他給很大
            StringBuilder sb = new StringBuilder();
            //
            if(n==1){
                sb = sb.insert(0,n);
            }
            for(int i=9; i>1; i--){
                while(n%i == 0){
                    n = n/i;
                    sb = sb.insert(0,i);
                    //System.out.println("n:"+n+", sb:"+sb);
                }
            }
            //System.out.println("Fin n:"+n+", sb:"+sb);
            System.out.println(n==1?sb:-1);
            
        }
    }
}