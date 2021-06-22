import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 5;
		for(int i=0; i<10; i++){
			if(i == a) i++;
			System.out.println(i);
		}
	}
}