import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prime Check
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> primeList = new ArrayList<Integer>();

        for(int i=n; i<=m; i++){
            if(primeCheck(i)) primeList.add(i);
        }

        System.out.println(primeList);

    }

    public static Boolean primeCheck(int n){
        if(n==1) return false;
        for(int i=2; i<n; i++){
            if(n % i== 0) return false;
        }
        return true;
    }
}
