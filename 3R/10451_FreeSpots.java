//http://hellowalk.blogspot.com/2018/03/java-uva-10703-free-spots.html
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int W = sc.nextInt();
			int H = sc.nextInt();
			int N = sc.nextInt();

			if(W == 0 && H == 0 && N == 0) break;

			boolean graph[][] = new boolean[W+1][H+1];

			while(N-->0){
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();

				for(int i = Math.min(x1,x2); i <= Math.max(x1,x2); i++){
					for(int j = Math.min(y1,y2); j <= Math.max(y1,y2); j++){
						graph[i][j] = true;
					}
				}
			}

			int count = 0;
			for(int i=1; i <= W; i++){
				for(int j=1; j <= H; j++){
					if(graph[i][j] != true) count++;
				}
			}

			if(count == 0) 
                System.out.println("There is no empty spots.");
			else if(count == 1) 
                System.out.println("There is one empty spot.");
			else 
                // System.out.println("There are " + count + " empty spots.");
                System.out.printf("There are %d empty spots.\n", count);
		}
	
	}
}