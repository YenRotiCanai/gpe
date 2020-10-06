//https://a7069810.pixnet.net/blog/post/394903234-%5Buva10050%5D-hartals

import java.util.Scanner;

class p10517{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		while((--cases)>=0){
			int d = sc.nextInt(); //總共天數
			int p = sc.nextInt(); //黨派數量

			int days[] = new int[d+1]; //總天數
			int party[] = new int[p]; //黨派罷工天

			for(int i=0; i<p; i++){
				party[i] = sc.nextInt(); //罷工天的倍數
			}

			//實際罷工的日期
			for(int i=0; i<p; i++){
				int multRec = 0;
				for(int j=1; j<d+1; j++){
					multRec = party[i] * j; //罷工的日期

					if(multRec < d+1){
						days[multRec] = 1;
					}else break;
				}
			}

			int count = 0;
			for(int i=0; i<d+1; i++){
				if(i%7!=6 && i%7!=0 && days[i]==1){
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}