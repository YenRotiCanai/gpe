//輸入兩個數字，找出他們之間的 prime

import java.util.*;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> prime = new ArrayList<Integer>();

        if(n>m){
            int tmp = n;
            n = m;
            m = tmp;
        }

        for(int i=n; i<=m; i++){
            if(primeCheck(i)){
                prime.add(i);
            }
        }
        
        System.out.println(prime);
    }

    public static Boolean primeCheck(int n){
        System.out.println("n:"+n);
        if(n==1) return false;
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}