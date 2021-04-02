import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while(T-->0){
			int M = sc.nextInt();
			int N = sc.nextInt();
			int Q = sc.nextInt();

			char map[][] = new char[M][N];

			for(int i=0; i<M; i++){
				String st = sc.next();
				for(int j=0; j<N; j++){
					map[i][j] = st.charAt(j);
				}
			}

			System.out.printf("%d %d %d\n", M, N, Q);

			while(Q-->0){
				int r = sc.nextInt();
				int c = sc.nextInt();

				int ans = 1;
				for(int i=1; i<=M; i++){
					boolean flag = true;

					for(int a=r-i; a<=r+i; a++){
						for(int b=c-i; b<=c+i; b++){
							if(a<0 || b<0 || a>=M || b>=N || map[a][b]!=map[r][c]){
								flag = false;
								break;
							}
						}
					}
					if(flag) ans+=2;
					else break;
				}
				System.out.println(ans);
			}
		}
	}
}