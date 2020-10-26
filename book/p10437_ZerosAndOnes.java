//https://a7069810.pixnet.net/blog/post/392080000-%5Buva10324%5D-zeros-and-ones

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int count = 1;
		while(sc.hasNext()){
			String str = sc.next();
			System.out.println("Case "+count+":");
			int cases = sc.nextInt();

			while(cases-->0){
				int a = sc.nextInt();
				int b = sc.nextInt();

				if(a>b){
					int tmp = a;
					a = b;
					b = tmp;
				}

				boolean flag = true;
				for(int i=a; i<b; i++){
					if(str.charAt(a)!=str.charAt(i+1)){
						flag = false;
						break;
					}
				}

				if(flag) System.out.println("Yes");
				else System.out.println("No");
			}
			count++;
		}
	}
}