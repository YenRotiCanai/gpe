//p10419_DivideButNotQuiteConquer
import java.util.*;

class temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	long n = sc.nextLong();
        	long m = sc.nextLong();

        	if((n<2) || (m<2)){
        		System.out.println("Boring!");
        		continue;
        	}

        	long backup = n;

        	while(n%m==0) n/=m;

        	if(n!=1) System.out.println("Boring!");
        	else{
        		n = backup;
        		while(n%m == 0 && n>1){
        			System.out.print(n+" ");
        			n/=m;
        		}
        		System.out.println(1);
        	}
        }
    }
}