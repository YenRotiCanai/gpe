//10567:Common Permutation

import java.util.*;

class p10567 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
        	String s1 = sc.nextLine();
        	String s2 = sc.nextLine();
        	int arr1[] = new int[123];
        	int arr2[] = new int[123];

        	for(int i=0; i<s1.length(); i++){
        		arr1[s1.charAt(i)]++;
        	}

        	for(int j=0; j<s2.length(); j++){
        		arr2[s2.charAt(j)]++;
        	}

        	for(char c='a'; c<='z'; c++){
        		for(int num=1; num<=Math.min(arr1[c], arr2[c]); num++){
        			System.out.print(c);
        		}
        	}
        	System.out.println();
        }
    }
}