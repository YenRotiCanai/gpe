import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int field = 1;
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();

			if(h==0 && w==0) break;
			if(field != 1) System.out.println();

			char map[][] = new char[h+5][w+5];

			for(int i=1; i<=h; i++){
				for(int j=1; j<=w; j++){
					map[i][j] = '0';
				}
			}

			for(int i=1; i<=h; i++){
				String str = sc.next();
				for(int j=1; j<=w; j++){
					char d = str.charAt(j-1);

					if(d=='*'){
						map[i][j] = '*';

						for(int m=-1; m<=1; m++){
							for(int n=-1; n<=1; n++){
								if(map[m+i][n+j]!='*')
									map[m+i][n+j]++;
							}
						}
					}
				}
			}

			System.out.println("Field #"+field+":");

			for(int i=1; i<=h; i++){
				for(int j=1; j<=w; j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			field++;
		}
	}
}