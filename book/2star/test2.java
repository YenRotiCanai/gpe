import java.util.*;

public class test2{

	static int row, col;
	static char map[][];
	static boolean Collected[][];

	public static void CollectOil(int i, int j){
		if(i<0 || j<0 || i>=row || j>=col) return;
		else if(map[i][j]=='*' || Collected[i][j]==true) return;
		else{
			Collected[i][j] = true;
			CollectOil(i-1, j-1);
			CollectOil(i-1, j);
			CollectOil(i-1, j+1);
			CollectOil(i, j-1);
			CollectOil(i, j+1);
			CollectOil(i+1, j-1);
			CollectOil(i+1, j);
			CollectOil(i+1, j+1);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			row = sc.nextInt();
			col = sc.nextInt();
			sc.nextLine();

			map = new char[row][col];
			Collected = new boolean[row][col];

			if(row==0) break;

			String tmp;
			for(int i=0; i<row; i++){
				tmp = sc.nextLine();
				for(int j=0; j<col; j++){
					map[i][j] = tmp.charAt(j);
					Collected[i][j] = false;
				}
			}
			//System.out.println(Arrays.deepToString(map));

			int Num = 0;
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
					if(map[i][j]=='@' && Collected[i][j]==false){
						Num++;
						CollectOil(i,j);
					}
				}
			}

			System.out.println(Num);
		}
	}
}