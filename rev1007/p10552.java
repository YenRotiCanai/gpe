import java.util.*;

class p10552{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int run = 1;

		while(sc.hasNext()){
			int correctLineCount = sc.nextInt();

			if(correctLineCount == 0) break;
			
			sc.nextLine();
			String correct = "";
			while(correctLineCount-->0){
				correct += sc.nextLine() + "\n";
			}

			int submittedLineCount = sc.nextInt();
			sc.nextLine();
			String submitted = "";
			while(submittedLineCount-->0){
				submitted += sc.nextLine() + "\n";
			}

			String correctNumbers = correct.replaceAll("[^0-9]+","");
			String submittedNumbers = submitted.replaceAll("[^0-9]+","");

			System.out.print("Run #"+run+": ");

			if(correct.equals(submitted)) System.out.println("Accepted");
			else if(correctNumbers.equals(submittedNumbers)) System.out.println("Presentation Error");
			else System.out.println("Wrong Answer");

			run++;
		}
	}
}