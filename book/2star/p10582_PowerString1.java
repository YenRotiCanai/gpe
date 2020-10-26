//pg191
//要背起來，弄不懂他的邏輯

import java.util.*;

public class p10582_PowerString1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.equals(".")) break;

            char c[] = str.toCharArray();
            int len = str.length();
            boolean flag = false;

            for(int i=1; i<=len; i++){
                //如果 i 不是 len 的因數，那他就不是 a，直接跳下一輪
                if(len%i != 0) continue;

                flag = true;
                for(int j=i; j<len && flag==true; j+=i){
                    for(int k=0; k<i && flag==true; k++){
                        if(c[k]!=c[k+j]) flag = false;
                    }
                }
                if(flag){
                    System.out.println(len/i);
                    break;
                }
            }
        }
        sc.close();
    }
}
