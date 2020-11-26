//https://a7069810.pixnet.net/blog/post/391276504-%5Buva10038%5D-jolly-jumpers
import java.util.Scanner;
import java.util.Arrays;

class p10405{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int cases = sc.nextInt(); //測資數量

			//把資料輸入到陣列裡面
			int arr[] = new int[cases];
			for(int i=0; i<cases; i++){
				arr[i] = sc.nextInt();
			}

			boolean flag = true;
			//如果只有一個cases，就是 jolly
			if(cases!=1){
				//算兩個差的絕對值後，放進陣列裡排序
				int arrD[] = new int[cases-1];
				for(int i=0; i<arr.length-1; i++){
					arrD[i] = Math.abs(arr[i]-arr[i+1]);
				}

				//這裏排序
				Arrays.sort(arrD);

				//最後看他的差是不是從1開始一直慢慢往上加，不是的話就 false 然後跳出
				for(int i=0; i<arrD.length; i++){
					//System.out.printf("arrD[%d]:%d, %d+1:%d\n",i,arrD[i],i,i+1);
					if(arrD[i]!=i+1){
						flag = false;
						break;
					}
				}
			}
			if(flag) System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
	}
}