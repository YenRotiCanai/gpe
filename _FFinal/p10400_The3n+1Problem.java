//要用long，這題用 c++ 會比較好，吃的時間和記憶體比較少

import java.util.*;

class FFtest{

	static long add(long a){
		long len = 1;
		while(a != 1){
			if(a % 2 != 0) a = 3 * a + 1;
			else a /= 2;
			len++;
		}
		return len;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			long a = sc.nextLong();
			long b = sc.nextLong();

			System.out.printf("%d %d ", a, b);

			if(a > b){
				long tmp = a;
				a = b;
				b = tmp;
			}

			long maxLen = 0;
			for(long i = a; i<=b; i++){
				maxLen = Math.max(maxLen, add(i));
			}

			System.out.println(maxLen);
		}

	}
}