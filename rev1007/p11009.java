import java.util.Scanner;

class p10566{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s1 = sc.next();
			String s2 = sc.next();

			int s1Len = s1.length();
			int s2Len = s2.length();

			int s1Index = 0;

			char s1Arr[] = s1.toCharArray();
			char s2Arr[] = s2.toCharArray();

			for(int i=0; i<s2Len; i++){
				if(s2Arr[i] == s1Arr[s1Index]){
					s1Index ++;
					if(s1Index == s1Len) break;
				}
			}

			if(s1Index == s1Len) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}