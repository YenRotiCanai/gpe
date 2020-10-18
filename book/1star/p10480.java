//https://blog.xuite.net/b81621java/blog/135949998-10480%3A+Square+Numbers
import java.util.Scanner;

class p10480{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt(); //開始號碼
			int b = sc.nextInt(); //結束號碼

			if((a+b)==0) break; //如果兩個都是 0 的話，break

			int i=1; //宣告一個 i，當成是現在的號碼
			int count=0;

			while(a>(i*i)) i++; //當 a > i 的 square，代表還沒開始，所以一直加到開始號碼，才繼續下去

			//System.out.println(i);

			while(b>=(i*i)){ //當 b > i 的 square 時，代表他還在那兩個號碼中間，所以計算次數 count，每計完一次再讓 i++，迴圈繼續，一直到他超過 b 才停止
				count ++;
				i++;
			}

			//最後印出 count 的次數就知道這兩個號碼之間有多少個 square
			System.out.println(count);
		}
	}
}