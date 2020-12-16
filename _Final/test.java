import java.util.*;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            boolean first = true;
            long N_M = sc.nextLong();

            if(N_M == 0) break;

            for(int i=9; i>=0; i--){
                if((N_M - i) % 9 == 0){
                    if(!first) System.out.print(" ");

                    System.out.print((N_M-i) / 9 * 10 + i);
                    first = false;
                }
            }
            System.out.println();
        }
    }
}