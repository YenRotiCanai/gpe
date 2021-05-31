/*
https://a7069810.pixnet.net/blog/post/392436142-%5BUva11342%5D%20Three-Square

k^2 = a^2 + b^2 + c^2
*/
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
			double k = sc.nextDouble();
			Vector<Integer> vt = new Vector<Integer>();
			boolean flag = false;

			//sqrt(k) = a+b+c
			//找出 k 的整數根號
			int powM = (int)Math.sqrt(k);

			for(int a=0; a<powM; a++){
				//b^2+c^2=k-a^2。
				//先把 a^2 減掉，找 b^2 + c^2
				double tmpK = k-(a*a);

				for(int b=0; b<powM; b++){
					//c^2 = k-a^2-b^2
					//再減掉上面的 tmpK，就會得到 c^2
					double tmpK2 = tmpK-(b*b);

					//把 c^2 sqrt後，如果還可以得會一樣的
					//就代表他是 ok 的
					int c = (int)Math.sqrt(tmpK2);
					if((c*c) == (int)tmpK2){
						vt.add(a);
						vt.add(b);
						vt.add(c);
						flag = true;
						break;
					}
				}
				if(flag) break;
			}

			if(vt.size() == 3) System.out.println(vt.get(0)+" "+vt.get(1)+" "+vt.get(2));
			else System.out.println("-1");
		}
	
	}
}