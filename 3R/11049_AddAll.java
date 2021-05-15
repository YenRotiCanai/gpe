
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

            //從第 2 個開始，一直和上一個加
            //加完後給回自己，然後重新排序
            //下一輪就會變成 第二個和第三個
            for(int i=1; i<n; i++){
                arr[i]+=arr[i-1];
                sum += arr[i];
                Arrays.sort(arr);
            }
            System.out.println(sum);
        }
    }
}
