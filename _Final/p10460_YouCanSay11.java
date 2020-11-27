import java.util.*;

class temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	String st = sc.nextLine();
        	if(st.equals("0")) break;

        	int odd=0, even=0;

        	for(int i=0; i<st.length(); i++){
        		if(i%2==0) even += st.charAt(i)-48;
        		else odd += st.charAt(i)-48;
        	}

        	if((odd-even)%11==0) System.out.println(st + " is a multiple of 11.");
        	else System.out.println(st + " is not a multiple of 11.");
        }
    }
}