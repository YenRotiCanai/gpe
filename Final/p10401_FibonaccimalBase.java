//http://kpeggy.blogspot.com/2014/03/javafibonaccimal-base.html

package _Final;

import java.util.Scanner;

class p10401_FibonaccimalBase {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        
        ////宣告陣列來存放事先算好的費氏數列
        int f[] = new int[39];
        f[0] = f[1] = 1;
        
        //先算好費氏數列，再把他放進陣列裡面
        for(int i=2; i<39; i++){
            f[i] = f[i-1]+f[i-2];
        }
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();

            //將index位置設定從最後一個位置開始
            int index = f.length-1;

            //陣列起始位置不能大於 m
            while(m < f[index]) index--;

            System.out.print(m + " = ");

            for(int j = index; j>=1; j--){
                if(m >= f[j]){
                    System.out.print(1);
                    m -= f[j];
                }
                else System.out.print(0);
            }
            System.out.println(" (fib)");
        }        
        sc.close();
    }
}
