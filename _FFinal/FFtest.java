import java.util.*;

class robot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int cases = sc.nextInt();

			while(cases-->0){
				int n = sc.nextInt();
				sc.nextLine();

				int arr[] = new int[n+1];

				for(int i=1; i<=n; i++){
					String str = sc.nextLine();

					if(str.equals("LEFT")) arr[i] = -1;
					else if(str.equals("RIGHT")) arr[i] = 1;
					else{
						int t = Integer.parseInt(str.substring(8));
						arr[i] = arr[t];
					}
				}

				int sum = 0;
				for(int i=1; i<=n; i++){
					sum += arr[i];
				}
				System.out.println(sum);
			}
		}
	}
}