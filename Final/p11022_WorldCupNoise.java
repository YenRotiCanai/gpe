//https://blog.csdn.net/mobius_strip/article/details/39801239
import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long fib[] = new long[100];
        fib[0] = fib[1] = 1;
        for(int i=2; i<55; i++){
            fib[i] = fib[i-1]+fib[i-2];
        }

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            System.out.println("Scenario #"+(i+1)+":");
            System.out.println(fib[m+1]);
            System.out.println();
        }
    }
}