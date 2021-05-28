import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = 11;
        int total = 0;

        while(n>0){
            total += n%10;
            n/=10;
        }

        System.out.println(total);
	}
}