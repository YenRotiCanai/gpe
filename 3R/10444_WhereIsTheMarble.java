//陣列排序
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = 1;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int q = sc.nextInt();

			if(n==0 && q==0) break;

			int arr[] = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);

			System.out.printf("CASE# %d:\n", cases++);

			while(q-->0){
				int x = sc.nextInt();
				int y = 0;
				boolean found = false;
				for(int i=0; i<n; i++){
					if(x == arr[i]){
						y = i;
						found = true;
						break;
					}
				}

				if(found) 
					System.out.printf("%d found at %d\n",x, y+1);
				else System.out.printf("%d not found\n", x);
			}
		}
	
	}
}