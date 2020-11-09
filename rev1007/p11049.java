import java.util.*;

class p11049{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			if(N==0) break;

			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

			while(N-->0) pq.add(sc.nextInt());

			int ans = 0;
			while(pq.size() >= 2){
				int a = pq.poll();
				int b = pq.poll();
				int sum = a+b;

				ans += sum;
				pq.add(sum);
			}
			System.out.println(ans);
		}
	}
}