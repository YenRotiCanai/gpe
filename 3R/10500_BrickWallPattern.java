import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int fib[] = new int[51];
        fib[0] = 1;
        fib[1] = 1;
        for(int i=2; i<51; i++){
            fib[i] = fib[i-1]+fib[i-2];
        }

        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==0) break;
            System.out.println(fib[n]);
        }
    }
}