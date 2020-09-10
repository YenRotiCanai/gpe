//http://hellowalk.blogspot.com/2018/03/java-uva-10954-add-all.html

import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			if(N==0) break;

			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

			while(N-->0) pq.add(sc.nextInt());

			int ans = 0;
			while(pq.size() >= 2){
				// System.out.print("T_ans:"+ans+", ");
				// System.out.println(pq);

				int a = pq.poll();
				int b = pq.poll();
				int sum = a+b;

				// System.out.println("a:"+a+", b:"+b+", sum:"+sum);
				
				ans += sum;
				pq.add(sum);

				// System.out.print("F_ans:"+ans+", ");
				// System.out.println(pq);
				// System.out.println();
			}
			System.out.println(ans);
		}
	}
}