//https://github.com/fernandohbc/MyPCS/blob/master/uvaonlinejudge/src/volume_ci/P10104_EuclidProblem.java
//看不懂他到底怎樣算的

import java.util.Scanner;

public class P10104_EuclidProblem {
  // This is a simple implementation of the extended euclidean algorithm
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    while (scn.hasNextInt()) {
      int a = scn.nextInt();
      int b = scn.nextInt();

      int x = 0;
      int y = 1;
      int prev_x = 1;
      int prev_y = 0;
      while (b != 0) {
        int q = a/b;

        int tmp = b;
        b = a%b;
        a = tmp;

        int next_x = prev_x - q * x;
        prev_x = x;
        x = next_x;     

        int next_y = prev_y - q * y;
        prev_y = y;
        y = next_y;     
      }
      System.out.println(prev_x + " " + prev_y + " "  + a);
    }             
  }
}