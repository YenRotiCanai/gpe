import java.util.Scanner;

class p10528{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long n = sc.nextLong(); //用 long 收測資
			if(n == 0) break;
			long a = (long)Math.sqrt(n); //開根號

			if( a*a == n) System.out.println("yes"); //看開完根號之後的互乘，是不是和原來的自己一樣，是的話就 yes
			else System.out.println("no");
		}
	}
}