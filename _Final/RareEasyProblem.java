//http://hellowalk.blogspot.com/2018/04/java-uva-10633-rare-easy-problem.html
import java.util.*;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            boolean first = true;
            long n = sc.nextLong();

            if(n == 0) break;

            for(int i=9; i>=0; i--){
                if((n - i) % 9 == 0){
                    if(!first) System.out.print(" ");

                    System.out.print((n-i) / 9 * 10 + i);
                    first = false;
                }
            }
            System.out.println();
        }
    }
}