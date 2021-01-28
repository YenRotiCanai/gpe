import java.util.Scanner;

class p11076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	if(n==0) break;

        	long g = 0;
        	for(int i=1; i<n; i++){
        		for(int j=i+1; j<=n; j++){
        			g += GCD(i,j);
        		}
        	}
        	System.out.println(g);
        }
    }

    static int GCD(int i, int j){
    	if(i%j==0) return j;
    	else return GCD(j, i%j);
    }
}