//https://a7069810.pixnet.net/blog/post/391893409-%5Buva490%5D-rotating-sentences

import java.util.Scanner;
import java.util.Vector;

class p21914{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Vector<String> vector = new Vector<String>();

		int cases = 0; //字串行數
		int maxLength = 0; //最長字串長度

		while(sc.hasNextLine()){
			String st = sc.nextLine();
			if(st.length()>maxLength)
				maxLength = st.length(); //保持在最大長度
			vector.add(st);
			cases++;
		}

		int count = 0; //計算需要的空白

		//一個字一個字抓
		for(int i=0; i<maxLength; i++){
			count = 0;
			for(int j=cases-1; j>=0; j--){
				if(!(i>=vector.get(j).length())){
					while(count > 0){
						System.out.print(" ");
						count --;
					}
					System.out.print(vector.get(j).charAt(i));
					count = 0;
				}else{
					count ++;
				}
			}
			System.out.println("");
		}
		
	}
}