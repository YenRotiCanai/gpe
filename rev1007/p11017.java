import java.util.*;

class p10405{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		while((s=sc.nextLine())!=null){
			char [] c1=s.toCharArray();
		 	char [] c2=sc.nextLine().toCharArray();

		 	int count = 0;
		 	int k = 0;

		 	if(c1.length > c2.length){
		 		char temp[] = c1;
		 		c1 = c2;
		 		c2 = temp;
		 	}

		 	for(int i=0; i<c1.length; i++){
			  	for(int j=k; j<c2.length; j++){
				  	if(c1[i]==c2[j]) {
					  	count++;
					  	k=j;
					}
			  	}
		  	}

		  	System.out.println(count);
		}
	}
}