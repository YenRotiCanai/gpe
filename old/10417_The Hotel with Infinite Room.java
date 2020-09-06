import java.util.*;

class Main{
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  while(sc.hasNext()){
			int s = sc.nextInt();
		  	long g = sc.nextLong();

			while(g>0){
				g-=s;	//g = g-s
				s++;	//s = s+1
				//System.out.println(g);
			}
			System.out.println(--s);//
	  }
  }
}