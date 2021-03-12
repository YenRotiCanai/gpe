import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;

            int arr[] = new int[100001];
            for(int i=1; i*i<100001; i++){
                arr[i*i]=1;
            }
            
            for(int i=1; i<100001; i++){
                arr[i] += arr[i-1];
            }
            System.out.println(arr[b]-arr[a-1]);
        }
    }
}