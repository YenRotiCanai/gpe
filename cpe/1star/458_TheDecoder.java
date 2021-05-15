import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            
            for(int i=0; i<str.length(); i++){
                char chr = (char)(str.charAt(i) - 7);
                System.out.print(chr);
            }
            System.out.println();
        }
    }
}