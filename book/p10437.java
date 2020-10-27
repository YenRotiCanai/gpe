//10437:Zeros and Ones
//找區間內的數字有沒有相同
//有兩種解法，1 是用charAt來找；2 是用substring
//覺得substring比簡單
//還要注意他測值給的起始和結尾有可能會是反的，所以要轉過來


//https://a7069810.pixnet.net/blog/post/392080000-%5Buva10324%5D-zeros-and-ones
//https://blog.xuite.net/b81621java/blog/134847823-10437%3A+Zeros+and+Ones

import java.util.*;

class p10437{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNext()){
			System.out.printf("Case %d:%n",++count);
			String s1 = sc.next();
			int n = sc.nextInt();
			while(n-->0){
				int a = sc.nextInt();
				int b = sc.nextInt();

				if(a>b){
					int tmp = a;
					a = b;
					b = tmp;
				}

				String s2 = s1.substring(a,b+1); //substring最後一個不會吃到，所以要 +1
				if(s2.contains("0") && s2.contains("1")) System.out.println("No");
				else System.out.println("Yes");
			}
		}

	}
}