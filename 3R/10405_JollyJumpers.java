import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int a = sc.nextInt();
            
            Set<Integer> jset = new HashSet<Integer>();
            
            for(int i=1; i<n; i++){
                int b = sc.nextInt();
                int d = Math.abs(a-b);

                if(d>0 && d<n) jset.add(d);
                a = b;
            }

            System.out.println(jset.size()==n-1? "Jolly":"Not jolly");
        }
	}
}