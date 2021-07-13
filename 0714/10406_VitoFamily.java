import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            //插入鄰居門牌
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); //先排序
            int sum = 0;
            int mid = arr[n/2]; //找中間那一個
            //把其他人和中間相減，取 abs 後加總起來
            for(int i=0; i<n; i++){
                sum += Math.abs(mid - arr[i]);
            }

            System.out.println(sum);
        }
    }
}