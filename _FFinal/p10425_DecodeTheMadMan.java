//https://blog.xuite.net/b81621java/blog/141589534-10425%3A+Decode+the+Mad+man
import java.util.Scanner;

class FFtest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//把鍵盤的按鍵從右到左設定進來
		//從 = 開始
		//空格總共要 3 個
		String kb = "=-0987654321][poiuytrewq';lkjhgfdsa/.,mnbvcxz   ";

		while(sc.hasNext()){

			String input = sc.nextLine().toLowerCase(); //要記得要換成小寫
			StringBuilder sb = new StringBuilder();

			//有遇到相同的字的話，就往右移兩格
            //雖然題目是說要往左兩格，可是因為一開始就先把整個鍵盤的左右顛倒了（由右到左設定進來的地方）
            //所以這邊就可以往右
			for(int i=0; i<input.length(); i++){
				for(int j=0; j<kb.length(); j++){
					if(input.charAt(i) == kb.charAt(j)){
						sb.append(kb.charAt(j+2)); //往右 2 個
						break;
					}
				}
			}

			System.out.println(sb);
		}

	}
}