//http://hellowalk.blogspot.com/2018/05/java-uva-10013-super-long-sums.html
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        boolean first = true;

        while(n-->0){
            if(!first) System.out.println();

            sc.nextLine();
            int m = Integer.parseInt(sc.nextLine());
            int ans[] = new int[m+1];

            for(int i=1; i<=m; i++){
                //用 stringtokenizer 來吃一行裡面的兩個整數
                //先把他整行吃進來
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                //再把它分給 a 和 b
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                ans[i] = a + b;
            }

            //這邊處理進位，先處理前一位，最後才處理自己
            for(int i=m; i>0; i--){
                //先把前一個除10，拿到進位值加總
                ans[i-1] += ans[i]/10;
                //然後才用 mod 10 處理自己
                ans[i] %= 10;
            }

            StringBuilder sb = new StringBuilder();
            //如果第一個有東西，就先把它加進去
            //因為不確定他的數目是多大，所以不知道裡面會不會有東西
            //只能先判斷再看要不要加進去
            if(ans[0] != 0) sb.append(ans[0]);

            for(int i=1; i<=m; i++) sb.append(ans[i]);

            System.out.println(sb);
            first = false;
        }
    }
}