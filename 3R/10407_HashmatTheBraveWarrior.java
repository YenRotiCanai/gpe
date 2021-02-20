import java.util.*;

class Main{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println(Math.abs(a-b));
        }
    }
}