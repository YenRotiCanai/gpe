import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();

			while(n-->0){
				Long m = sc.nextLong();
				
				if(m==1){
					System.out.println(1);
					continue; //要放這個 continue, 不然會多印一行出來
				}

				StringBuilder sb = new StringBuilder();
				for(int i=9; i>1; i--){
					while(m%i==0){
						m/=i;
						sb = sb.insert(0,i);
					}
				}

				System.out.println(m==1? sb: -1);
			}
		}
	}
}