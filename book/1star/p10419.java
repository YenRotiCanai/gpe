import java.util.Scanner;

class p10419{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			long n = sc.nextLong();
			long m = sc.nextLong();

			//特殊狀況，不用計算，直接輸出
			if((n<2) || (m<2)){
				System.out.println("Boring!");
				continue;
			}

			long backup = n; //先把 n 備份起來，後面會用到

			while(n%m==0) n/=m; //和(n==n/m)意思是一樣的

			if(n!=1) System.out.println("Boring!");
			else{
				n = backup;
				while(n%m == 0 && n>1){
					System.out.print(n+" ");
					n/=m;
				}
				System.out.println(1);
			}
		}
	}
}