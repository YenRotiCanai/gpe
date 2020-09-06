/*  https://onlinejudge.org/external/111/p11150.pdf
    最佳解：input*1.5
*/
import java.util.Scanner;

class Cola{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            double y = x * 1.5;
            //int ans = (int)y;
            System.out.println((int)y);
        }
        sc.close();
    }
}