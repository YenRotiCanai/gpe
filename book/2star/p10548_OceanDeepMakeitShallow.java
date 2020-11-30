import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder("");
        Character c;
        String line;
        int d = 131071;
        int mod;
        while((line = br.readLine()) != null){
            mod = 0;
            while (!line.endsWith("#")) {
                line += br.readLine();
            }
            for (int i = 0; i < line.length()-1; i++) {
                c = line.charAt(i);
                mod = (mod*2 + Integer.parseInt(c.toString())) % d;
            }
            if(mod == 0){
                out.append("YES" +"\n");
            }else{
                out.append("NO" +"\n");
            }
        }
        System.out.print(out);
    }
}