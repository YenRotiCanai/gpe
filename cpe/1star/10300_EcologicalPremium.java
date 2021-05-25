import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int cases = sc.nextInt();

            while(cases-->0){
                int farmer = sc.nextInt();
                long sum = 0;
                
                while(farmer-->0){
                    long size = sc.nextLong();
                    long animal = sc.nextLong();
                    long env = sc.nextLong();

                    sum += size*env;
                }
                
                System.out.println(sum);
            }
        }
    }
}