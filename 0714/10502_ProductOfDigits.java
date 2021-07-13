import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int cases = sc.nextInt();

            while(cases-->0){
                Long n = sc.nextLong();

                if(n==1){
                    System.out.println(1);
                }else{
                    StringBuilder sb = new StringBuilder();
                    for(int i=9; i>=2; i--){
                        while(n % i == 0){
                            sb.insert(0, i);
                            n /= i;
                        }
                    }
                    System.out.println( n == 1? sb:"-1");
                }
            }
        }
    }
}