//https://blog.xuite.net/b81621java/blog/147444520-10517%3A+Hartals
//天數 mod 日期，如果 ==0，就++
import java.util.*;

class p10517 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int t = sc.nextInt();

        	for(int i=0; i<t; i++){
        		int n = sc.nextInt();
        		int p = sc.nextInt();
        		int ph[] = new int[p];
        		
        		for(int j=0; j<p; j++){
        			ph[j] = sc.nextInt();
        		}

        		int hcount = 0;
        		for(int j=1; j<=n; j++){
        			if(j%7!=6 && j%7!=0){
        				for(int k=0; k<p; k++){
        					if(j%ph[k]==0){
        						hcount++;
        						break;
        					}
        				}
        			}
        		}
        		System.out.println(hcount);
        	}
        }
    }
}
