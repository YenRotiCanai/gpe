import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            sc.nextLine();
            int arr[] = new int[n+1];

            String str = sc.nextLine();
            int sum = 0;
            for(int i=1; i<=n; i++){
                if(str.equals("LEFT")) arr[i] = -1;
                else if(str.equals("RIGHT")) arr[i] = 1;
                else{
                    int tmp = str.substring(8);
                    arr[i] = arr[tmp];
                }
                sum += arr[i];
            }
            System.out.println(sum);
        }
	}
}