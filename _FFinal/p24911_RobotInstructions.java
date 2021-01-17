//不能直接用 Integer.parseInt(sc.nextLine()) 來吃測資，會 TLE
//只好吃 int，然後吃完後要吃換行

import java.util.*;

class robot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int cases = sc.nextInt();

			while(cases-->0){
				int n = sc.nextInt();
				sc.nextLine();

				//開一個陣列把指令存起來，如果是left就存 -1，如果是right就存 1
				//最後把陣列裡的全部加起來就是答案了
				//如果遇到same as的，就用substring(8)，來取得跟他同樣指令的樓層，然後丟給目前的層數
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