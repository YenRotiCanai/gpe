import java.util.*;

class p10552{
	public static void main(String[] args) throws Throwable{
		Scanner sc = new Scanner(System.in);
		int run = 1; //記錄次數

		while(sc.hasNextInt()){
			//讀入正確答案
			int correctLineCount = sc.nextInt();
			if(correctLineCount == 0) break;

			sc.nextLine();
			String correct = ""; //宣告一個String來放答案
			//把答案都串起來
			for(int i=0; i<correctLineCount; i++){
				correct += sc.nextLine() + "\n";
			}
			//System.out.println(correct);

			int submittedLineCount = sc.nextInt();
			sc.nextLine();
			String submitted = ""; //一樣，宣告一個String來放他的input
			for(int i=0; i<submittedLineCount; i++){
				submitted += sc.nextLine() + "\n";
			}
			//System.out.println(submitted);

			//下面這兩個是把裡面非字元都拿掉，留下數字
			String correctNumbers = correct.replaceAll("[^0-9]+", "");
			String submittedNumbers = submitted.replaceAll("[^0-9]+", "");

			//System.out.println(correctNumbers);

			System.out.print("Run #"+ run + ": ");
			if(correct.equals(submitted)) System.out.println("Accepted"); //如果全部都對的話，就Accepted
			else if(correctNumbers.equals(submittedNumbers)) System.out.println("Presentation Error"); //如果只有數字一樣，就PE
			else System.out.println("Wrong Answer"); //不然就是完全不一樣，WA

			run++; //跑完一次就次數++
		}
	}
}