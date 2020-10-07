import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String s;
	  while((s=br.readLine())!=null){
		  char [] c1=s.toCharArray();
		  char [] c2=br.readLine().toCharArray();

		  int count=0;
		  int k=0;
		  if(c1.length > c2.length){
			  //System.out.println("c1 is longer.");
			  for(int i=0;i<c2.length;i++){
				  
				  //System.out.println("1. k before giving to j: "+k);
				  
				  for( int j=k;j<c1.length;j++){

					  //System.out.println("2. Value of j: "+j);
					  if(c2[i]==c1[j]) {
						  count++;
						  k = j;
						  //System.out.println("3. k after giving to j: "+k+"\n");
					  }
				  }
			  }
		  }else{
			  //System.out.println("c2 is longer");
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