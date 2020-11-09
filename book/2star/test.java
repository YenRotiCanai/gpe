import java.util.Scanner;

class temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		long p=0, q=0;
		while(sc.hasNext() && (p=sc.nextLong())>=0 && (q=sc.nextLong())>=0){
			long sum = 0;
			p--;

			while(p>0){
				sum = sum - (p/10)*45 - (p%10+1) * (p%10)/2;
				p/=10;
			}

			while(q>0){
				sum = sum + (q/10)*45 + (q%10+1) * (q%10)/2;
				q/=10;
			}

			System.out.println(sum);
		}
    }
}