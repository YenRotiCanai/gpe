//https://a7069810.pixnet.net/blog/post/391644826-%5Buva10922%5D-2-the-9s

import java.util.Scanner;

class p10458{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String st = sc.next();

			if(st.equals("0")) break;

			int count = 0;
			String temp = st;
			while(true){
				int total = 0;
				for(int i=0; i<temp.length(); i++){
					total = total+temp.charAt(i)-48;
				}

				if(total%9==0){
					count ++;
					if(total==9) break;
					else temp = Integer.toString(total);
				}else{
					break;
				}
			}
			if(count!=0) System.out.println(st + " is a multiple of 9 and has 9-degree " + count +".");
			else System.out.println(st + " is not a multiple of 9.");
		}
	}
}