import java.util.Scanner;

class rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int run = 1;
        
        while(sc.hasNext()){
            int correctLineCounts = sc.nextInt();
            if(correctLineCounts == 0) break;

            sc.nextLine();
            String correct = "";
            for(int i=0; i<correctLineCounts; i++){
                correct += sc.nextLine()+"\n";
            }

            int submittedLineCounts = sc.nextInt();
            sc.nextLine();
            String submitted = "";
            for(int i=0; i<submittedLineCounts; i++){
                submitted += sc.nextLine()+"\n";
            }

            String correctNumbers = correct.replaceAll("[^0-9]+","");
            String submittedNumbers = submitted.replaceAll("[^0-9]+","");
            
            System.out.print("Run #"+run+": ");
            if(correct.equals(submitted)) System.out.println("Accepted");
            else if(correctNumbers.equals(submittedNumbers)) System.out.println("Presentation Error");
            else System.out.println("Wrong Answer");

            run ++;
        }
        sc.close();
    }
}