//https://a7069810.pixnet.net/blog/post/391312900-%5Buva10057%5D-a-mid-summer-night%27s-dream

import java.util.Scanner;

class p10409{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int cases = sc.nextInt(); //測資數量
			
			int arr[] = new int[cases]; //依照測資大小開陣列
			for(int i=0; i<cases; i++){
				arr[i] = sc.nextInt(); //把測資直接讀進去陣列裡面
			}
			Arrays.sort(arr); //排序陣列裡面的東西

			//找中位數
			int mid = arr[(arr.length-1)/2];
			int mid2 = arr[(arr.length)/2];

			//統計一樣是中位數的數量
			int count = 0;
			for(int i=0; i<arr.length; i++){
				if(arr[i]==mid || arr[i]==mid2) count++;
			}

			//有幾種可能？
			int D = mid2-mid+1;

			System.out.println(mid+" "+count+" "+D);
		}
	}
}