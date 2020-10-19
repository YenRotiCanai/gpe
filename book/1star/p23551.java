//https://a7069810.pixnet.net/blog/post/395939704-%5Buva10908%5D-largest-square

import java.util.Scanner;

class p23551{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int cases =  sc.nextInt();
		while(cases --> 0){
			int m = sc.nextInt(); //長
			int n = sc.nextInt(); //寬
			int q = sc.nextInt(); //測資組數

			char grid[][] = new char[m][n]; //裝字串的陣列

			for(int i=0; i<m; i++){
				String tmp = sc.next(); //把每一行以string的方式先讀進來

				for(int j=0; j<n; j++){
					grid[i][j] = tmp.charAt(j); //用charAt來分配到陣列裡面
				}
			}

			//先印一個和題目一樣的
			System.out.println(m+" "+n+" "+q);
			while(q-->0){
				//讀測資
				int m2 = sc.nextInt();
				int n2 = sc.nextInt();

				//把對應到的字元原點先抓出來給 cmp
				char cmp = grid[m2][n2];

				//以原點為中心，和四周比較看看是不是和原點一樣
				int i=0; //擴張的程度
				for(i=0; i<m; i++){
					boolean flag = true;
					for(int j=m2-i; j<=m2+i; j++){
						for(int k=n2-i; k<=n2+i; k++){
							if(j<0 || k<0 || j>=m || k>=n || cmp!=grid[j][k]){
								flag = false;
								break;
							}
						}
					}
					if(!flag) break;
				}
				System.out.println(i*2-1);
			}
		}
	}
}