import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.nextLine();
            int n = str.charAt(8)-'0';
            System.out.println(n);
        }
	}
}