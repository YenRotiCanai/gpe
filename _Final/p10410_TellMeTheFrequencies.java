//https://a7069810.pixnet.net/blog/post/394903351-%5Buva10062%5D-tell-me-the-frequencies%21

import java.util.Scanner;

public class p10410_Frequencies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean newLine = false; //為了控制換行

        while(sc.hasNext()){

        	if(newLine) System.out.println();

        	String s = sc.nextLine();
        	int arr[] = new int[128];

            //統計每個字元出現的次數
        	for(int i=0; i<s.length(); i++){
        		arr[s.charAt(i)]++;
        	}

            //找出最多次數的那一個
        	int max = 0;
        	for(int i=0; i<arr.length; i++){
        		if(arr[i] > max) max = arr[i];
        	}

            //由最少次數，從陣列的最後面開始找，這樣就符合題目要求的先從小到大印出次數，再來才是看ASCII的順序
        	for(int i=1; i<=max; i++){
        		for(int j=arr.length-1; j>=0; j--){
        			if(arr[j] == i) System.out.println(j+" "+i);
        		}
        	}

        	newLine = true;
        }
    }
}