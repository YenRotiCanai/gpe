import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int num = sc.nextInt();
            BigInteger ans = fecto(num);

            String str = ans.toString();

            int Sumans = 0;
            for(int i = str.length() - 1; i >= 0; i--){
                Sumans += str.charAt(i) - '0';
            }

            System.out.println(Sumans);
        }
    }

    public static BigInteger fecto(int num){

        BigInteger ans = BigInteger.valueOf(num);

        for(long i = 2; i < num; i++)
            ans = ans.multiply(BigInteger.valueOf(i));
        return ans;
    }
}