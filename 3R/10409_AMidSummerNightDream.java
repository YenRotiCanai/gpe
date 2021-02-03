import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int mid1 = arr[(n-1)/2];
            int mid2 = arr[n/2];
            int count = 0;
            for(int i=0; i<n; i++){
                if(arr[i]==mid1 || arr[i]==mid2) count++;
            }

            int D = mid2 - mid1 + 1;

            System.out.printf("%d %d %d\n", mid1, count, D);
        }
	}
}