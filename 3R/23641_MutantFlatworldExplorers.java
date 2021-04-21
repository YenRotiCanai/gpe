//https://blog.xuite.net/b81621java/blog/175566184-11020%3A+Eb+Alto+Saxophone+Player%09
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//吃測資座標邊界
		int edgeX = sc.nextInt();
		int edgeY = sc.nextInt();
		//用來記錄機器有沒有掉下去，題目說最大50
		boolean arr[][] = new boolean[51][51];

		//因為是 2d array，所以要多一個 for 來把全部 array 裝滿
		//如果是 1d 的話，直接用 fill 就好
		for(int i=0; i<51; i++) Arrays.fill(arr[i],false);

		while(sc.hasNext()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			//next 吃進來是 string 的，要用 charAt 把他換成 char
			char orientation = sc.next().charAt(0);
			String cmd = sc.next();

			for(int i=0; i<cmd.length(); i++){
				
				//如果是往前走的話
				if(cmd.charAt(i)=='F'){
					//先建兩個 tmp 的測試用
					int tmpX = x, tmpY = y;
					
					//判斷方向來加減座標
					if(orientation == 'N') tmpY++;
					else if(orientation == 'S') tmpY--;
					else if(orientation == 'W') tmpX--;
					else tmpX++;

					//如果超出邊界
					if(tmpX>edgeX || tmpY>edgeY || tmpX<0 || tmpY<0){
						//加上這裏沒有出事過，就把他標記起來，警示後人
						//然後直接說他 lost 了，接著 break 出去
						if(!arr[x][y]){
							arr[x][y] = true;
							System.out.println(x+" "+y+" "+orientation+" LOST");
							break;
						}
					}else{
						//沒有超出的話，就把他還回去
						x = tmpX;
						y = tmpY;
					}

				}else //如果不是往前走，是轉向的話，就用自訂的轉向方法
					orientation = rotate(orientation, cmd.charAt(i));
				//這個不能放在 for 外面，不然如果他 lost 了，會輸出兩次
				//因為 lost 了就有直接輸出一次了
				if(i==cmd.length()-1) System.out.println(x+" "+y+" "+orientation);
			}
		}
	}

	//自訂一個轉向的 method
	public static char rotate(char ori, char cmd){
		switch(cmd){ 
			//轉向第一階段，看是轉左還是右
			case 'R': //這是右轉
				switch(ori){ 
					//第二階段
					case 'N': //如果目前是朝北，朝北右轉就會變成朝東
						ori = 'E';
						break;

					case 'S':
						ori = 'W';
						break;

					case 'W':
						ori = 'N';
						break;

					case 'E':
						ori = 'S';
						break;
				}
				break;
			
			case 'L': //這是左轉
				switch(ori){
					case 'N':
						ori = 'W';
						break;

					case 'S':
						ori = 'E';
						break;

					case 'W':
						ori = 'S';
						break;

					case 'E':
						ori = 'N';
						break;
				}
				break;
		}
		return ori;
	}
}