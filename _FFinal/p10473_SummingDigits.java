//10473:Summing Digits
//http://kpeggy.blogspot.com/2013/07/javasumming-digits.html
import java.util.Scanner;

class FFtest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String str = sc.nextLine();

			//這要用 equals 來比較
			if(str.equals("0")) break;

			//用長度來看他是幾位數
			while(str.length() != 1){
				int sum = 0;

				//把每個數字單獨拿出來加總
				for(int i=0; i<str.length(); i++){
					sum += str.charAt(i)-'0';
				}

				//加總完後，再把他變回string
				str = Integer.toString(sum);
			}

			System.out.println(str);

		}

	}
}