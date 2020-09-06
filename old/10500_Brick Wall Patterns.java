import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  long table[] = new long[51]; //用long來儲存預先算好的答案
	  table[0] = 1; 
	  table[1] = 1;
	  for(int i = 2; i<51; i++){
		  table[i] = table[i-1] + table[i-2]; //計算每一個格子裡的答案
	  }

	  while(sc.hasNext()){
		  int n = sc.nextInt();
		  if(n==0){
			  break;
		  }else{
			  System.out.println(table[n]);
		  }
	  }
  }
}