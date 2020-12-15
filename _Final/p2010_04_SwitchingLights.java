import java.util.Scanner;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            long m = sc.nextLong();

            long a = (long)Math.sqrt(m);

            if( a * a == m ) System.out.println("yes");
            else System.out.println("no");
        }
    }
}