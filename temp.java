import java.util.Scanner;

public class p10552_AutomatedJudgeScript {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        int run = 1; //記錄執行次數

        while(sc.hasNext()){
            //讀入正確答案的行數
            int correctLineCount = sc.nextInt();
            if(correctLineCount==0) break;

            sc.nextLine(); //吃掉換行
            String correct = ""; //宣告一個String來放正確答案
            //把答案都先串起來
            for(int i=0; i<correctLineCount; i++){
                correct += sc.nextLine() + "\n";
            }

            //接下來是提交的答案
            //一樣先讀取行數
            int submittedLineCount = sc.nextInt();
            sc.nextLine();//吃掉換行
            String submitted = ""; //宣告一個String來放，然後再把他串起來
            for(int i=0; i<submittedLineCount; i++){
                submitted += sc.nextLine() + "\n";
            }

            //到判斷步驟，把非字元拿掉，留下數字
            String correctNumbers = correct.replaceAll("[^0-9]+", "");
            String submittedNumbers = submitted.replaceAll("[^0-9]+", "");

            System.out.print("Run #"+run+": ");
            if(correct.equals(submitted))System.out.println("Accepted");
            else if(correctNumbers.equals(submittedNumbers)) System.out.println("Presentation Error");
            else System.out.println("Wrong Answer");

            run++;
        }
    }
}