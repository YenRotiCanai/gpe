import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine()); //case的數量
		int s1, s2;

		for(int i=1; i<=n; i++){
			s1 = Integer.parseInt(sc.nextLine(), 2); //把2進制的輸入用parseInt轉成int
			s2 = Integer.parseInt(sc.nextLine(), 2);

			int tmp;

			while(s2>0){
				tmp = s1 % s2;
				s1 = s2;
				s2 = tmp;
			}

			if(s1>1){
				System.out.println("Pair #" + i + ": All you need is love!");
			} else {
				System.out.println("Pair #" + i + ": Love is not all you need!");
			}
		}

		sc.close();
		
	}
}