import java.util.Scanner;

class p10400{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.print(a+" "+b+" ");

      if(a>b){
        int c=a; a=b; b=c;
      }

      int maxLen = 0;
      for(int k=a; k<=b; k++){
        int n=k, len=1;

        while(true){
          if(n==1) break;
          if(n%2==1) n=n*3+1;
          else n/=2;

          len++;
        }
        maxLen = Math.max(maxLen, len);
      }
      System.out.println(maxLen);
    }
  }
}