import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int sum = 0;

            if(p<0 && q<0) break;

            for(int i=p; i<=q; i++){
                sum += F(i);
            }
            System.out.println(sum);
        }
	}

    static int F(int n){
        if(n==0) return 0;
        else if(n%10 > 0) return n%10;
        else return F(n/10);
    }
}