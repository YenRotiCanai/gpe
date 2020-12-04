import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		s = s.replaceAll(" ","");
		
		int sum = 0;
		while(!(sum>0 && sum<10)){
			sum = 0;
			char arr[] = s.toCharArray();
			for(int i=0; i<arr.length; i++){
				sum += (arr[i]-'0');
			}
			s = Integer.toString(sum);

		}
		System.out.println(sum);
		
	}
}