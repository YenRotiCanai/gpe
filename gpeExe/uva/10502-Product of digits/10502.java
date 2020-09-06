//https://a7069810.pixnet.net/blog/post/391312900-%5Buva10057%5D-a-mid-summer-night%27s-dream
//http://kos74185foracm.blogspot.com/2011/08/993-product-of-digits.html
//https://blog.xuite.net/b81621java/blog/204937454-d418.+993+-+Product+of+digits

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
	while(sc.hasNext()){
		int cases = sc.nextInt();
		//System.out.println("A");

		for(int i=0; i<cases; i++){
			long n = sc.nextInt();
			// System.out.println("i:"+i);
			if(n==1){
				System.out.println("1");
				continue;
			}

			StringBuilder sb = new StringBuilder();
			for(int j=9; j>1; j--){
				while(n%j==0){
					// System.out.println("j:"+j+" n:"+n);
					n = n/j; //這裡，n 代表被除的答案，然後再作為除的繼續下去
					sb = sb.insert(0,j);
				}
			}
			System.out.println(n==1?sb:-1); //如果 n 等於 1（也就是代表他成功除完了，就印出最後答案。反之，如果不是 1，那就代表他不存在，然後印出 -1。
		}

	}
  }
}