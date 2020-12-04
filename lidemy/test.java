import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][2];

		for(int i=0; i<n; i++){
			for(int j=0; j<2; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		int distance = cal_D(arr[0][0], arr[1][0], arr[0][1], arr[1][1]);
		int min_d = distance;
		int x1 = arr[0][0];
		int x2 = arr[1][0];
		int y1 = arr[0][1];
		int y2 = arr[1][1];
		//System.out.println(distance);

		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++ ){

				//System.out.println("i:"+i+", j:"+j);

				distance = cal_D(arr[i][0], arr[j][0], arr[i][1], arr[j][1]);

				if(distance < min_d){
					min_d = distance;
					x1 = arr[i][0];
					x2 = arr[j][0];
					y1 = arr[i][1];
					y2 = arr[j][1];
				}
			}
		}

		if(x1<x2) {
			System.out.println(x1+" "+y1);
			System.out.println(x2+" "+y2);
		}else if(x2<x1) {
			System.out.println(x2+" "+y2);
			System.out.println(x1+" "+y1);
		}else {
			if(y1<y2){
				System.out.println(x1+" "+y1);
				System.out.println(x2+" "+y2);
			}else if(y2<y1){
				System.out.println(x2+" "+y2);
				System.out.println(x1+" "+y1);
			}
		}
	}

	static int cal_D(int x1, int x2, int y1, int y2){
		int x_square = Math.abs((x1-x2)*(x1-x2));
		int y_square = Math.abs((y1-y2)*(y1-y2));
		int d = (int)(Math.sqrt(x_square+y_square));
		return d;
	}
}