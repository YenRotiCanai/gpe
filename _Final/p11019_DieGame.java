import java.util.Scanner;

class p11019{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int cases = sc.nextInt();
        	if(cases==0) break;

        	int top=1, n=2, w=3, e=4, s=5, down=6, temp;
        	String st;

        	while(cases-->0){
        		st = sc.next();

        		if(st.equals("north")){temp=top; top=s; s=down; down=n; n=temp;}
        		if(st.equals("south")){temp=top; top=n; n=down; down=s; s=temp;}
				if(st.equals("east")){temp=top; top=w; w=down; down=e; e=temp;}
				if(st.equals("west")){temp=top; top=e; e=down; down=w; w=temp;}
        	}
        	System.out.println(top);
        }
    }
}