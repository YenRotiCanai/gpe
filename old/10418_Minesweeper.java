import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int field = 0, h, w;
		while (sc.hasNext() && (h = sc.nextInt()) != 0 && (w = sc.nextInt()) != 0) {
			if (field != 0)
				System.out.println(""); // 這什麼意思啊？
			char arr[][] = new char[h][w]; // 宣告地圖大小

			//開始讀入地圖
			for(int i=0; i<h; i++){ //一行一行讀
				String temp = sc.next();
				for(int j=0; j<w; j++){ //一個字一個字讀
					arr[i][j] = temp.charAt(j); //所以這裡就會把每一行的字都放進來
				}
			}
		

			//Output
			System.out.println("Field #"+(++field)+":"); //++field --> field+1

			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){ //每一個位子會比對8次
					int ans=0; //地雷數量

					if(arr[i][j]=='*'){ //先看自己是不是地雷，是的話就直接print *
						System.out.print('*');
					}else{ //如果自己不是地雷，才來看四周有沒有地雷
						if(i-1>=0 && arr[i-1][j]=='*') ans++;
						if(j+1<w && arr[i][j+1]=='*') ans++;
						if(i+1<h && arr[i+1][j]=='*') ans++;
						if(j-1>=0 && arr[i][j-1]=='*') ans++;

						if((i-1>=0 && j+1<w) && arr[i-1][j+1]=='*') ans++;
						if((i+1<h && j+1<w) && arr[i+1][j+1]=='*') ans++;
						if((i+1<h && j-1>=0) && arr[i+1][j-1]=='*') ans++;
						if((i-1>=0 && j-1>=0) && arr[i-1][j-1]=='*') ans++;

						System.out.print(ans);
					}
				}
				System.out.println("");
			}
		}
	}
}