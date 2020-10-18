//https://a7069810.pixnet.net/blog/post/392374039-%5Buva11349%5D-symmetric-matrix

import java.util.Scanner;

class p10478{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.next());
		for(int i=1; i<=cases; i++){
			String temp1 = sc.next(), temp2 = sc.next();//抓不要的測資

			int n = Integer.parseInt(sc.next());
			long arr[] = new long[n*n];

			int size = n*n;
			for(int j=0; j<size; j++){
				arr[j] = Long.parseLong(sc.next());//把測資讀進陣列裡面
			}

			boolean flag = true;
			for(int j=0; j<size; j++){
				if(arr[j]<0 || (arr[j]!=arr[size-1-j])){
					flag = false;
					break;
				}
			}
			if(flag) System.out.println("Test #"+i+": Symmetric.");
			else System.out.println("Test #"+i+": Non-symmetric.");
		}
	}
}