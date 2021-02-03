import java.util.*;

class Main{

    static int GCD(int x, int y){
        if(x % y == 0) return y;
        else return GCD(y, x%y);
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int G = 0;
            for(int i=1; i<n; i++){
                for(int j=i+1; j<=n; j++){
                    G += GCD(i, j);
                }
            }
            System.out.println(G);
        }
	}
}