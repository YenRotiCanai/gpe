import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String st = sc.next();

            if(st.equals("0")) break;

            int odd = 0, even = 0;

            for(int i=0; i<st.length(); i++){
                if(i%2 == 0) even += st.charAt(i) - '0';
                else odd += st.charAt(i) - '0';
            }

            if((odd-even)%11 == 0) System.out.printf("%s is a multiple of 11.\n", st);
            else System.out.printf("%s is not a multiple of 11.\n", st);
        }
    }
}