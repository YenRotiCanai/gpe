import java.util.*;

class p10406_vito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        while(cases-->0){
        	int n = sc.nextInt();
        	int arr[] = new int[n];

        	for(int i=0; i<n; i++){
        		arr[i] = sc.nextInt();
        	}

        	Arrays.sort(arr);

        	int sum = 0; 
        	int mid = arr[n/2];

        	for(int i=0; i<n; i++){
        		sum += Math.abs(mid-arr[i]);
        	}

        	System.out.println(sum);
        }
    }
}