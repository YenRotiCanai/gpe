//https://a7069810.pixnet.net/blog/post/391644826-%5Buva10922%5D-2-the-9s

import java.util.Scanner;

class p10458 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	String st = sc.next();

        	if(st.equals("0")) break;

        	int count = 0;
        	String tmp = st; //題目要求印出原測資，所以開多一個變數來存

        	while(true){

                //每次都要用新的total來算
        		int total = 0;

        		//把裡面的數字全部加起來
                for(int i=0; i<tmp.length(); i++){
        			total = total + tmp.charAt(i)-48;
        		}

                //如果mod 9 == 0 代表他是9的倍數
                //那就count++
                //如果他本身是 9，就不能再自己加自己，break出去
                //否則，就說明他還很大（兩位數以上），把total轉回字串，再跑一次迴圈

                //如果他不是9的倍數，直接跳出
        		if(total % 9 == 0){
        			count ++;
        			if(total == 9) break;
        			else tmp = Integer.toString(total);
        		}else break;
        	}

            //如果他是因為不是 9 的倍數而跳出來，那他的count一定是0，就可以印出他不是
        	if(count!=0) System.out.println(st + " is a multiple of 9 and has 9-degree " + count +".");
        	else System.out.println(st + " is not a multiple of 9.");
        }
    }
}