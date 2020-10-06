//http://hellowalk.blogspot.com/2018/05/java-uva-10013-super-long-sums.html

import java.util.*;

class p10510{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		boolean first = true;
		while(N-- >0){
			if(!first) System.out.println();
			sc.nextLine();

			int M = Integer.parseInt(sc.nextLine());
			int ans[] = new int[M+1];
			for(int i=1; i<=M; i++){
				StringTokenizer st = new StringTokenizer(sc.nextLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				ans[i] = a+b;
			}
			for(int i=M; i>=1; i--){
				ans[i-1] += ans[i]/10; //除10位了進位
				ans[i] %= 10; //mod 10位了拿個位數
			}

			StringBuilder sb = new StringBuilder();
			//從頭開始串 string
			//如果【0】的位子有值，就直接拿
			if(ans[0]!=0) sb.append(ans[0]);

			for(int i=1; i<=M; i++){
				sb.append(ans[i]);
			}
			System.out.println(sb.toString());
			first = false;
		}
	}
}