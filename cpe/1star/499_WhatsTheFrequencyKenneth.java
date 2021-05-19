import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            char cArr[] = new char[150];
            String str = sc.nextLine();
            int max = 0;
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);

                if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                    cArr[c]++;
                }
                max = Math.max(max, cArr[c]);
            }

            for(char c='A'; c<='Z'; c++){
                if(cArr[c] == max) System.out.print(c);
            }

            for(char c='a'; c<='z'; c++){
                if(cArr[c] == max) System.out.print(c);
            }

            System.out.println(" "+max);
        }
    }
}