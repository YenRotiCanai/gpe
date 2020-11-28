import java.util.*;

class p10453 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();

        for(int i=1; i<=cases; i++){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int sum = 0;

        	for(int j=a; j<=b; j++){
        		if(j%2==1)
        			sum+=j;
        	}
        	System.out.println("Case "+i+": "+sum);
        }
    }
}