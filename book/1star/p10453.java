//http://kpeggy.blogspot.com/2013/07/javaodd-sum.html

import java.util.*;

class p10453{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();

		for(int i=1; i<=cases; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = 0;

			for(int j=a; j<=b; j++){

				//System.out.printf("j:%d\n",j);

				if(j%2==1){ //用 %2==1 來拍斷，如果是奇數才放他進來
					sum+=j;
				}
			}
			System.out.println("Case " + i + ": " + sum);
		}
	}
}