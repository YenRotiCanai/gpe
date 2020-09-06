import java.util.Scanner;

class Hotel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int s = sc.nextInt();	//size and days
			long d = sc.nextLong();	//d day

			while(d>0){
				d-=s;
				s++;
				// System.out.println("d: "+d);
				// System.out.println("s: "+s);
			}
			System.out.println(--s);
		}
	}
}