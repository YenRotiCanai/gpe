//boolean 判斷是不是第一個
//replaceFirst 來替換

import java.util.*;

class FFtest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean first = true;

		while(sc.hasNext()){
			String str = sc.nextLine();

			while(str.contains("\"")){
				if(first) str = str.replaceFirst("\"","``");
				else str = str.replaceFirst("\"","''");
				first = !first;
			}
			System.out.println(str);
		}
	}
}