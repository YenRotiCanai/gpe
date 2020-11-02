import java.io.*;
import java.util.*;

public class rev {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        String str;
        StringBuilder sb = new StringBuilder("");
        int d = 131071;
        int mod;
        while(sc.hasNext()){
            str = sc.nextLine();
            mod = 0;
            
            while(!str.endsWith("#")){
                str += sc.nextLine();
            }

            for(int i=0; i<str.length()-1;i++){
                Character c = str.charAt(i);
                mod = (mod*2 + Integer.parseInt(c.toString())) % d;
            }
            if(mod==0) sb.append("Yes"+"\n");
            else sb.append("No"+"\n");
            System.out.print(sb);
        }
        
    }
}