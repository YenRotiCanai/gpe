import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());

    for (int i=1; i<=t; i++){
      boolean happy = true;
      Set<Integer> set = new HashSet<Integer>();

      int N = Integer.parseInt(sc.nextLine()); //讀 input 丟給 N
      set.add(N); //把 N 加進去 set 裡面
      int sum = N;

      while(sum != 1){ //如果結果等於 1， 會直接輸出是 happy number，可是這裡先把他放在最前面，所以每次都會進來，除非使用者直接輸入 1
        int N1 = sum; //宣告一個新的 N1，把他當成使用者 input
        sum = 0; //重置 sum 為 0
        System.out.println("N1: "+ N1);

        while(N1 > 0){ //計算該數字每一個位數的sum of square()
          sum += (N1 % 10) * (N1 % 10);
          N1 /= 10;
        }
        System.out.println("sum of square: "+ sum);

        if(set.contains(sum)){
          happy = false;
          break;
        }
        set.add(sum);
      }
      System.out.println("set: "+set);

      if(happy)
        System.out.println("Case #" + i + ": " + N + " is a Happy number.");
      else
        System.out.println("Case #" + i + ": " + N + " is an unHappy number.");

      System.out.println();
    }
  }
}