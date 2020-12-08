import java.util.*;
import java.lang.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sArr = new String[n];
		for(int i=0; i<n; i++){
		    sArr[i] = sc.next();
		}
		System.out.println(longestCommonPrefix(sArr));
	}

	static String longestCommonPrefix(String[] strs) {
	    String pre = strs[0];
	    int i=1;
	    while(i<strs.length){
	    //當 pre（第一個） 和 第二個不一樣的時候，減短第一個，一直減到他們一樣為止
		    while(strs[i].indexOf(pre)!=0){
		        pre = pre.substring(0, pre.length()-1);
		    }

	    	i++; //當他們終於一樣了，就會跳出來，然後輪到下一個
	    }
	    return pre;
	}
}