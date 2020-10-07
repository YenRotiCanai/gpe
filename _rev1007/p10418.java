import java.util.Scanner;

class p10418{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = 0, h, w;

		while((sc.hasNext()) && (h=sc.nextInt())!=0 && (w=sc.nextInt())!=0){
			if(T!=0) System.out.println();

			char field[][] = new char[105][105];

			//初始化陣列，給他預設成 0
			for(int i=1; i<=h; i++){
				for(int j=1; j<=w; j++){
					field[i][j] = '0';
				}
			}

			for(int i=1; i<=h; i++){
				String c = sc.next(); //把每一行讀進來
				for(int j=1; j<=w; j++){
					char d = c.charAt(j-1); //用 charAt 抓裡面的字元
					if(d == '*'){
						field[i][j] = '*';

						//把地雷周圍統統+1
						for(int m=-1; m<=1; m++){
							for(int n=-1; n<=1; n++){
								if(field[m+i][n+j]!='*') field[m+i][n+j]++;
							}
						}
					}
				}
			}
			System.out.println("Field #"+(++T)+":");
			for(int i=1; i<=h; i++){
				for(int j=1; j<=w; j++){
					System.out.println(field[i][j]);
				}
				System.out.println();
			}
		}
	}
}