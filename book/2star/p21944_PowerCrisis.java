import java.util.Scanner;

class temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	int N = sc.nextInt();
        	if(N==0) break;

        	N--;

        	for(int m=1; m<N; m++){
        		int off = 0;

        		for(int i=1; i<=N; i++){
        			off = (off+m)%i;
        		}

        		if(off == 11) break;
        	}
        	System.out.println(m);
        }
    }
}