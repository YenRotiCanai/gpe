
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==0) break;
            
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            long sum = 0;

            Arrays.sort(arr);

            for(int i=1; i<n; i++){
                arr[i]+=arr[i-1];
                sum += arr[i];
                Arrays.sort(arr);
            }
            System.out.println(sum);
        }
    }
}
