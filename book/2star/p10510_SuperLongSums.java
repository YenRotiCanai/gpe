import java.util.*;

public class temp {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());//這裡因為之後要空一行的原因，所以用nextLine直接吃掉這一行
        //之後還是要再空一行，如果沒有吃這一行，之後要吃空兩行(?)

        boolean first = true; //第一筆output之後每一個out要空一行

        while(N-->0){
        	if(!first) System.out.println();

    		sc.nextLine();

    		int M = Integer.parseInt(sc.nextLine());
    		int ans[] = new int[M+1];
    		for(int i=1; i<=M; i++){
    			StringTokenizer st = new StringTokenizer(sc.nextLine());

    			int a = Integer.parseInt(st.nextToken());
    			int b = Integer.parseInt(st.nextToken());
    			ans[i] = a+b;
    		}

    		for(int i=M; i>0; i--){
    			ans[i-1] += ans[i]/10;
    			ans[i] %= 10;
    		}

    		StringBuilder sb = new StringBuilder();
    		if(ans[0]!= 0) sb.append(ans[0]);

    		for(int i=1; i<=M; i++){
    			sb.append(ans[i]);
    		}
    		System.out.println(sb.toString());
    		first = false;
        }

    }
}