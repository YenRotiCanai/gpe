//http://hellowalk.blogspot.com/2018/07/java-uva-10008-whats-cryptanalysis.html
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		int arr[] = new int[200];
		int len = 0;

		while(n-->0){
			String str = sc.nextLine();
			len += str.length();
			// System.out.println(len);
			str = str.toUpperCase();
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
					arr[(int)str.charAt(i)]++;
				}
			}
		}

		while(len-->1){
			for(int i='A'; i<='Z'; i++){
				if(arr[i] == len) System.out.println((char)i + " "+ len);
			}
		}
		sc.close();
		// System.out.println(Arrays.toString(arr));
	}
}