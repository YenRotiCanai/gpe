import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int n = sc.nextInt();

            if(prime(n)){
                StringBuilder sb = new StringBuilder(n+""); //建新的字串時後面要加 “”
                sb.reverse(); //反轉字串

                //將反轉後的變成 int
                int rn = Integer.parseInt(sb.toString());

                //判斷開始
                if(rn == n) System.out.println(n + " is prime.");
                else{
                    if(prime(rn)) System.out.println(n + " is emirp.");
                    else System.out.println(n + " is prime.");
                }
            }else System.out.println(n + " is not prime.");
        }
	}

    //判斷他是不是 prime
    static boolean prime(int n){
        int sqn = (int)Math.sqrt(n);

        //從 2 一直到 sqrt(n)
        for(int i=2; i<=sqn; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}