import java.util.*;

class Main{
	static int m, n;
	static char map[][];
	static boolean collected[][];

	public static void collectOil(int i, int j){
		if(i<0 || j<0 || i>=m || j>= n) return; //檢查邊界
		else if(map[i][j] == '*' || collected[i][j]==true) return; //如果檢查過了就跳過
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
			m = sc.nextInt();
			n = sc.nextInt();
			sc.nextLine();

			if(m == 0) break;

			map = new char[m][n];
			collected = new boolean[m][n];

			String str;
			for(int i=0; i<m; i++){
				str = sc.nextLine();
				for(int j=0; j<n; j++){
					map[i][j] = str.charAt(j);
					collected[i][j] = false;
				}
			}

			int sum = 0;
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					if(map[i][j]=='@' && collected[i][j]==false){
						sum++;
						collectOil(i, j);
					}
				}
			}
			System.out.println(sum);
		}
	}
}