//https://gist.github.com/andy6804tw/7357e798390524f2c8ea4f60c516cf58

import java.util.Scanner;

import jdk.internal.jshell.tool.resources.l10n;

class p10582{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            if(s.equals(".")) break;

            for(int i=0; i<s.length(); i++){
                sb.append(s.charAt(i));

                if(s.length() % sb.length() != 0){
                    continue;
                }

                boolean b = true;

                for(int j=0; j<s.length(); j+=sb.length()){
                    if(!s.substring(j,j+sb.length()).equals(sb.toString())){
                        b = false;
                        break;
                    }
                }
                if(b) break;
            }
            System.out.println(s.length() / sb.length());
        }
    }    
}