//https://a7069810.pixnet.net/blog/post/391312900-%5Buva10057%5D-a-mid-summer-night%27s-dream

/*
1. 開陣列來存測資
2. 排序陣列
3. 找出中位數（有兩個）
4. 統計和中位數一樣的數字
5. 找出有幾種可能（mid2 - mid1 +1)
6. 印出 中位數，中位數の數量，有幾種可能
*/

import java.util.*;

public class p10409 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){

        	int cases = sc.nextInt();
        	int arr[] = new int[cases];

        	for(int i=0; i<cases; i++){
        		arr[i] = sc.nextInt();
        	}

        	Arrays.sort(arr);

        	int mid = arr[(arr.length-1)/2];
        	int mid2 = arr[arr.length/2];

        	int count=0;
        	for(int i=0; i<arr.length; i++){
        		if(arr[i] == mid || arr[i] == mid2) count++;
        	}

        	int D = mid2-mid+1;

        	System.out.println(mid+" "+count+" "+D);

        }
    }
}