import java.util.Scanner;

class p10528_LightMoreLight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        while(cases-->0){
            long n = sc.nextLong();

            long a = (long)Math.sqrt(n);

            if( a * a == n ) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
