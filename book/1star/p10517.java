//https://blog.xuite.net/b81621java/blog/147444520-10517%3A+Hartals

import java.util.Scanner;

public class test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int t = sc.nextInt(); //測資的筆數

			for(int i=0; i<t; i++){
				int n = sc.nextInt(); //罷工總天數
				int p = sc.nextInt(); //黨派數量
				int ph[] = new int[p]; //黨派陣列

				for(int j=0; j<p; j++){
					ph[j] = sc.nextInt();
				}

				int hcount = 0;
				for(int j=1; j<=n; j++){ //跑每一天的迴圈
					if(j%7!=6 && j%7!=0){ //不等於週五和週六（根據表格給的資訊）
						for(int k=0; k<p; k++){ //跑每一個黨派的迴圈

							//因為是倍數的關係，所以他只要日期mod罷工天 == 0
							//就代表那天罷工，count++
							if(j%ph[k]==0){ 
								hcount++;
								break;
							}
						}
					}
				}

				System.out.println(hcount);

			}
		}
	}
}