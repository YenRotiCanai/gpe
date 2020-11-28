//https://a7069810.pixnet.net/blog/post/392374039-%5Buva11349%5D-symmetric-matrix
//把2維矩陣變成1維矩陣，判斷首尾數值是否相同。

import java.util.*;

class p10478 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cases = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=cases; i++){
        	String tmp1 = sc.next(), tmp2 = sc.next();
        	//tmp2 用來抓'='

        	int n = Integer.parseInt(sc.next());
        	long arr[] = new long[n*n];

        	int size = n*n;

        	//把測資讀進陣列裡面
        	for(int j=0; j<size; j++){
        		arr[j] = Long.parseLong(sc.next());
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