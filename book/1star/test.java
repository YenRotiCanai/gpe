import java.util.Scanner;
public class p10454 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			long n = in.nextLong();
			for(int i=0;i<n;i++){
				long s = in.nextLong();
				long d = in.nextLong();
				long b = s - d; 
				if(b>=0&&b%2==0){
					b=b/2;
					System.out.println(s-b+" "+b);
				}else {
					System.out.println("impossible");
				}
			}
		}
	}
}