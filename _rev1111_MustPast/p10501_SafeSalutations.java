import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int p[] = new int[11];
		p[0] = p[1] = 1;

		for(int i=2; i<=10; i++){
			p[i] = 0;
			for(int j=0; j<i; j++){
				p[i] += p[j] * p[i-j-1];
			}
		}

		int cases = 1;
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(cases >1) System.out.println();
			System.out.println(p[n]);
			cases++;
		}
	}
}