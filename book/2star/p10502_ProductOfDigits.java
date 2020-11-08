//https://blog.xuite.net/b81621java/blog/204937454-d418.+993+-+Product+of+digits

import java.util.Scanner;

public class p10502_ProductOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();

            while(n-->0){
                long m = sc.nextLong();

                if(m==1){
                    System.out.println(1);
                    continue;
                }

                StringBuilder sb = new StringBuilder();
                for(int i=9; i>1; i--){
                    while(m%i==0){
                        m/=i;
                        sb = sb.insert(0, i);
                    }
                }

                System.out.println(m==1? sb : -1);
            }
        }
    }
}
