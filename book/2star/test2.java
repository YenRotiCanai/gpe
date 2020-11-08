import java.util.Scanner;
public class p10502 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int c = in.nextInt();
			
			for(int i=0;i<c;i++){
				long n = in.nextInt();
				if(n==1){
					System.out.println(1);
					continue;
				}
				StringBuilder sb = new StringBuilder();
				for(int j=9;j>1;j--){
					while(n%j==0){
						n = n/j;
						sb=sb.insert(0,j);
					}
				}
				System.out.println(n==1?sb:-1);
			}
		}
	}
}