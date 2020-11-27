//https://blog.xuite.net/b81621java/blog/141589534-10425%3A+Decode+the+Mad+man

import java.util.Scanner;

class p10425 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //把鍵盤的按鍵從右到左設定進來
        //空格鍵要多兩個
        String str = "=-0987654321][poiuytrewq';lkjhgfdsa/.,mnbvcxz   ";

        while(sc.hasNext()){
        	
        	String input = sc.nextLine().toLowerCase();
        	StringBuilder sb = new StringBuilder();
        	
            //有遇到相同的字的話，就往右移兩格
            //雖然題目是說要往左兩格，可是因為一開始就先把整個鍵盤的左右顛倒了（由右到左設定進來的地方）
            //所以這邊就可以往右
        	for(int i=0; i<input.length(); i++){
        		for(int j=0; j<str.length(); j++){
        			if(input.charAt(i) == str.charAt(j)){
        				sb.append(str.charAt(j+2)); //往右兩格
                        break;
                    }
        		}
        	}
        	System.out.println(sb);
        }
    }
}