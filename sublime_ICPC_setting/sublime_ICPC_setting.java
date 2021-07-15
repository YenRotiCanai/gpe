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
  
        // Your Code Start Here
  
        // Read input
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
  
        // Print output
        System.out.println(inp + " World!");
	}
}