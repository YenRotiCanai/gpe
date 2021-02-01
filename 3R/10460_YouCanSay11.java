import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.equals("0")) break;

            int even=0, odd=0;

            for(int i=0; i<str.length(); i++){
                if(i%2==0) even += str.charAt(i)-'0';
                else odd += str.charAt(i)-'0';
            }

            if((even-odd)%11==0) System.out.println(str + " is a multiple of 11.");
            else System.out.println(str + " is not a multiple of 11.");
        }
	}
}