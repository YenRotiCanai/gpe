import java.util.Scanner;
import java.util.StringTokenizer;

public class p10510_SuperLongSums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine()); //no. cases
        boolean first = true;
        while(N-- > 0){
            if(! first) System.out.println(); //第一個輸出後，接下來的輸出都要空一行
            sc.nextLine(); //每一個case中間都會空一行

            int M = Integer.parseInt(sc.nextLine()); //測資的數量
            int ans[] = new int[M+1];
            for(int i=1; i<=M; i++){
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                //把同一行的兩個數字分開，然後再加起來存進去陣列
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                ans[i] = a+b;
            }

            for(int i=M; i>=1; i--){ //從陣列後面開始做
                ans[i-1] += ans[i]/10; //（進位）除10以後的值，加到前一個
                ans[i] %= 10; //用mod來算除完10以後的值，然後再把它存回去
            }

            StringBuilder sb = new StringBuilder();
            if(ans[0] != 0) sb.append(ans[0]); //避免輸出的第一個是0
            for(int i=1; i<=M; i++) sb.append(ans[i]); //把陣列裡面的都串起來

            System.out.println(sb.toString());
            first = false;
        }
    }
}