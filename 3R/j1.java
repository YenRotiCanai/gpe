import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            sc.nextLine();

            int arr[] = new int[n+1];
            int final_pos = 0;

            for(int i=1; i<=n; i++){
                String str = sc.nextLine();

                if(str.equals("LEFT")) arr[i] = -1;
                else if(str.equals("RIGHT")) arr[i] = 1;
                else{
                    int tmp = Integer.parseInt(str.substring(8));
                    arr[i] = arr[tmp];
                }
                final_pos += arr[i];
            }
            System.out.println(final_pos);
        }
	}
}