//http://hellowalk.blogspot.com/2018/04/java-uva-10633-rare-easy-problem.html
import java.util.*;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] denoms = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};

        while(sc.hasNext()){
            String str = sc.nextLine();

            if(str.equals("0.00")) break;

            String[] sp = str.split("\\.");

            int sp1 = Integer.parseInt(sp[0]), sp2 = Integer.parseInt(sp[1]);
            int money = sp1*100 + sp2;

            int ways[] = new int[money+1];
            ways[0] = 1;

            for(int denom:denoms){
                for(int amount = 5; amount < money+1; amount++){
                    if(denom <= amount) ways[amount] += ways[amount-denom];
                }
            }

            System.out.printf("%6s%17d%n",str,ways[money]);
        }
    }
}