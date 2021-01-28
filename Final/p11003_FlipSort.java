//https://blog.xuite.net/b81621java/blog/69859252-a539.+10327+-+Flip+Sort

import java.util.Scanner;

class p11003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int arr[] = new int[n];

        	int count = 0;

        	for(int i=0; i<n; i++){
        		arr[i] = sc.nextInt();

        		//看前一個是不是比自己大，是的話就 count ++
        		for(int j=i-1; j>=0; j--){
        			if(arr[j] > arr[i]) count++;
        		}
        	}
        	System.out.println("Minimum exchange operations : "+count);
        }
    }
}