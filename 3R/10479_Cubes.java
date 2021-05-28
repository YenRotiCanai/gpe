//60^3 - 59^3 = 10621 已經超過 10000，所以先建表格，60個 i^3 的
//之後就找到大過測資的那一個，減掉測資，剩下的再從表格裡面找
//有的話就有，沒有就 no solution
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//建表
		int arr[] = new int[61];
		for(int i=1; i<61; i++){
			arr[i] = i*i*i;
		}

		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;

			//找出大於測資的
			int x = 1;	
			while( n > arr[x]) x++;
			
			//接下來找第二個比較小的那個
			int diff = arr[x] - n;
			int y = x-1;

			//如果找不到，就把值變得更小再找
			while(arr[y] != diff && y>0){
				y--;
			}

			if(arr[y] == diff) System.out.println(x + " " + y);
			else System.out.println("No solution");

		}
	}
}