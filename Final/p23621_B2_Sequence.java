//23621:B2-Sequence
//http://hellowalk.blogspot.com/2018/03/java-uva-11063-b2-sequence.html

import java.util.*;

class p23621 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = 1;
        while(sc.hasNext()){
        	boolean flag = false; //如果為 true，就不是 B2
        	int a =sc.nextInt();

        	int b[] = new int[a];
        	boolean sum[] = new boolean[20001]; //兩個數的上限都是10000，所以相加後是20001

        	int current = 0;

        	//開始把每一筆的測資都讀進來
        	for(int i=0; i<a; i++){
        		b[i] = sc.nextInt();

        		//是負數或是突然變小的話，它就不是B2了
        		if(b[i] <= current || b[i] < 1){
        			flag = true;
        			//這裡不能 break，會 RE
        		}
        		//若正常，就把他交給current，迴圈繼續的時候會再次比對下一筆和這一筆
        		current = b[i];
        	}

        	//如果現在flag和一開始一樣是 false，那 ！flag 就等於 true，通過 if 判斷
        	if(!flag){
        		for(int i=0; !flag && i<a; i++){
        			for(int j=i; !flag && j<a; j++){
        				int add = b[i] + b[j];

        				//把 add 當成 index
						//如果 Sum 陣列裡面，在 add 的位置已經被我們設定為 true 的話，！true 就是 false，if 判斷會直接跳去 false 的那邊，告訴 flag 說他有東西了，快變成 true
						//反之，如果沒有東西，那我們就把他設定為 true
        				if(!sum[add]) sum[add] = true;
        				else flag = true;
        			}
        		}
        	}

        	if(flag) System.out.println("Case #" + times + ": It is not a B2-Sequence.");
			else System.out.println("Case #" + times + ": It is a B2-Sequence.");

			times++;
			System.out.println();
        }
    }
}