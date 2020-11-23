package _Final;

//https://a7069810.pixnet.net/blog/post/391085665-uva10162-last-digit

import java.util.Scanner;

public class p10416_LastDigit {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        String st;
        int table[] = {1,4,7,6,5,6,3,6,9,0,1,6,3,6,5,6,7,4,9,0};

        while(sc.hasNext()){
            st = sc.next();
            if(st.equals("0")) break;

            String Q="";
            int R=0;

            //長除法
            while(true){
                for(int i=0; i<2; i++){
                    R = R * 10 + st.charAt(0) - 48;
                    st = st.substring(1);

                    if(st.equals("")) break;
                }

                if(R>=20){
                    Q = Q + (char)R/20;
                    R = R % 20;
                }else{
                    if(!st.equals("")){
                        R = R * 10 + st.charAt(0) - 48;
                        st = st.substring(1);
                    }
                    Q = Q + (char)R/20;
                    R = R % 20;
                }
                if(st.equals("")) break;
            }

            //取商數的最後一位數
            char last = Q.charAt(Q.length()-1);

            //sum up
            int ans = 0;
            ans = (last-48)*94;
            for(int i=0; i<R; i++){
                ans = ans+table[i];
            }

            //取個位數
            while(ans>10) ans = ans % 10;

            System.out.println(ans);
        }
    }
}