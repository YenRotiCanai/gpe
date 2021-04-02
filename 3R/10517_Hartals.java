//https://blog.xuite.net/b81621java/blog/147444520-10517%3A+Hartals

import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
		while(sc.hasNext()){
			int t = sc.nextInt(); //number of test cases

			while(t-->0){
				int n = sc.nextInt(); //天數
				int p = sc.nextInt(); //黨派
				int ph[] = new int[p]; //罷工天

				for(int i=0; i<p; i++){
					ph[i] = sc.nextInt();
				}

				int hcount = 0; //罷工天數
				for(int i=1; i<=n; i++){
					if(i%7 != 6 && i%7 != 0){ //五六日不算
						for(int j=0; j<p; j++){
							if(i % ph[j] == 0){
								hcount++;
								break; //這裏放一個 break，只要他這一天有罷工，只要加一次就會直接跳出 for，然後繼續跑下一天的。這樣就不會重複加到同一天的另一個罷工的黨派
							}
						}
					}
				}
				System.out.println(hcount);
			}
		}
    }
}