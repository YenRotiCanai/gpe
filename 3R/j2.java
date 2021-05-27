import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vt = new Vector<Integer>();

        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==0) break;

            vt.clear();
            for(int i=1; i<=n; i++){
                vt.add(i);
            }
    
            System.out.print("Discarded cards:");
    
            while(vt.size()>1){
                System.out.print(" " + vt.firstElement());
                if(vt.size()>2) System.out.print(",");
    
                vt.remove(0);
                //System.out.println("after discard:" + vt);
    
                vt.add(vt.elementAt(0));
                vt.remove(0);
    
                //System.out.println("new:" + vt);
            }
            System.out.println();
            System.out.printf("Remaining card: %d\n", vt.elementAt(0));
        }
	}
}