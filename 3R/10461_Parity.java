import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;
            //這裏要直接用 toBinaryString，不能用toString
            //會 TLE
			String str = Integer.toBinaryString(n);

			int count =0;
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i) == '1') count ++;
			}
			System.out.println("The parity of " + str +" is " + count + " (mod 2).");

		}
	}
}