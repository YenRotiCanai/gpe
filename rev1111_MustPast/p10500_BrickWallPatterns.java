import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long table[] = new long[51]; //long 要小寫
		table[0] = table[1] = 1;

		for(int i=2; i<51; i++){
			table[i] = table[i-1]+table[i-2];
		}

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(table[n]);
		}
	}
}