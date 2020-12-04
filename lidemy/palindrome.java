import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine(), s2 = "";
		char arr[] = s1.toCharArray();

		for(int i=arr.length-1; i>=0; i--){
			s2 += arr[i];
		}

		if(s1.equals(s2)) System.out.println("True");
		else System.out.println("False");
	}
}