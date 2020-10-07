import java.util.*;

class Main {
  public static void main(String[] args){
	  Scanner br = new Scanner(System.in);
	  String s;
	  while((s=br.nextLine())!=null){
		  char [] c1=s.toCharArray();
		  char [] c2=br.nextLine().toCharArray();

		  int count=0;
		  int k=0;
		  if(c1.length > c2.length){
			  for(int i=0;i<c2.length;i++){
				  for( int j=k;j<c1.length;j++){	
					  if(c2[i]==c1[j]) {
						  count++;
						  k = j;
					  }
				  }
			  }
		  }else{
			  for(int i=0; i<c1.length; i++){
				  for(int j=k; j<c2.length; j++){
					  if(c1[i]==c2[j]) {
						  count++;
						  k=j;
						}
				  }
			  }
		  }
		  System.out.println(count);
		}
	}
}