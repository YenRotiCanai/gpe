import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){

		if (System.getProperty("ONLINE_JUDGE") == null) {
            // Try block to check for exceptions
            try {
                System.setIn(new FileInputStream("input.txt"));
                System.setOut(new PrintStream(new FileOutputStream("output.txt")));
            }
  
            // Catch block to handle the exceptions
            catch (Exception e) {System.out.println("error");}
        }


		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			char cArr1[] = new char[130];	//ASCII 最多只到 126，所以陣列可以開到 130 就好
			char cArr2[] = new char[130];

			String s1 = sc.nextLine().toLowerCase();
			String s2 = sc.nextLine().toLowerCase();

			for(int i=0; i<s1.length(); i++){
				char c = s1.charAt(i);
				cArr1[c]++;
			}

			for(int i=0; i<s2.length(); i++){
				char c = s2.charAt(i);
				cArr2[c]++;
			}

			//依照字母的順序，只要他有出現過一次，就可以拿
			//所以比較的時候，從 1~ 到他的 min，也還是 1
			for(char c = 'a'; c <= 'z'; c++){
				for(int k=1; k<=Math.min(cArr1[c], cArr2[c]); k++){
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}