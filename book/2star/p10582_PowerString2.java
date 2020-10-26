//https://gist.github.com/andy6804tw/7357e798390524f2c8ea4f60c516cf58

import java.util.Scanner;

public class p10582_PowerString2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            if(str.equals(".")) break;

            for(int i=0; i<str.length(); i++){
                sb.append(str.charAt(i));

                if(str.length() % sb.length() != 0) continue;
                boolean flag = true;

                //j 每次都 + sb 的長度，而不是一個一個加
                for(int j=0; j<str.length(); j+=sb.length()){
                    if(!str.substring(j,j+sb.length()).equals(sb.toString())){
                        flag = false;
                        break;
                    }
                }
                if(flag) break;
            }
            System.out.println(str.length()/sb.length());
        }
        sc.close();
    }
}
