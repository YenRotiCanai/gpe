import java.util.Scanner;

class p10528_LightMoreLight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long n = sc.nextLong();
            if(n == 0) break;

            long a = (long)Math.sqrt(n);

            if( a * a == n ) System.out.println("yes");
            else System.out.println("no");
        }
    }
}