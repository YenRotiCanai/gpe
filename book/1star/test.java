import java.util.Scanner;
import java.util.Arrays;

class uva10038{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			//有多少筆資料
			int cases=sc.nextInt();
			
			//輸入資料
			int arr[]=new int[cases];
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}

			boolean flag=true;
			if(cases!=1){
				
				//取相鄰數字相減的值，並取絕對值
				int arrD[]=new int[cases-1];
				for(int i=0;i<arr.length-1;i++){
					arrD[i]=Math.abs(arr[i]-arr[i+1]);
				}
				
				//排序
				Arrays.sort(arrD);
				
				//檢查是否為1~(n-1)的值
				for(int i=0;i<arrD.length;i++){
					if(arrD[i]!=i+1){
						flag=false;
						break;
					}
				}
			}
			
			//結果輸出
			if(flag) System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
	}
}