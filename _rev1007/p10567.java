import java.util.Scanner;

class p10567{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			int c1[] = new int[123];
			int c2[] = new int[123];

			for(int i=0; i<s1.length(); i++){
				c1[s1.charAt(i)]++;
			}
			for(int j=0; j<s2.length(); j++){
				c2[s2.charAt(j)]++;
			}

			for(int k=79; k<=122; k++){
				for(int num=1; num <= Math.min(c1[k],c2[k]); num++){
					System.out.print((char)k);
				}
			}
			System.out.println();
		}
	}
}