import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int cases = 1;
        while(sc.hasNext()){
            String str = sc.next();
            System.out.printf("Case %d:\n", cases);
            int n = sc.nextInt();

            while(n-->0){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a>b){ int tmp=a; a=b; b=tmp;}

                boolean same = true;
                for(int i=a+1; i<=b; i++){
                    if(str.charAt(a) != str.charAt(i)){
                        same = false;
                        break;
                    }
                }
                System.out.println(same? "Yes":"No");
            }
            cases ++;
        }
	}
}