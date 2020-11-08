import java.util.*;

class OilDeposit{
	static int row, col;
	static char map[][];
	static boolean collected[][];

	public static void collectOil(int i, int j){
		if(i<0 || j<0 || i>=row || j>= col) return;
		else if(map[i][j]=='*' || collected[i][j]==true) return;
		else{
			collected[i][j] = true;
			collectOil(i-1, j-1);
			collectOil(i-1, j);
			collectOil(i-1, j+1);
			collectOil(i, j-1);
			collectOil(i, j+1);
			collectOil(i+1, j-1);
			collectOil(i+1, j);
			collectOil(i+1, j+1);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			row = sc.nextInt();
			col = sc.nextInt();
			sc.nextLine();

			if(row==0) break;

			map = new char[row][col];
			collected = new boolean[row][col];

			String tmp;
			for(int i=0; i<row; i++){
				tmp = sc.nextLine();
				for(int j=0; j<col; j++){
					map[i][j] = tmp.charAt(j);
					collected[i][j] = false;
				}
			}

			int sum = 0;
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
					if(map[i][j]=='@' && collected[i][j]==false){
						sum++;
						collectOil(i,j);
					}
				}
			}
			System.out.println(sum);
		}
	}
}