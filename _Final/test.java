package _Final;

import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int len = 0;
		int cT[] = new int[300];
		String s;
		char c;
		while(n-->0){
			s = sc.nextLine();
			for(int i=0; i<s.length(); i++){
				c = s.toUpperCase().charAt(i);
				cT[c]++;
				len++;
			}
		}

		while(--len>0){
			for( c = 'A'; c<='Z'; c++){
				if(cT[c]==len) System.out.println(c+" "+len);
			}
		}		

		sc.close();
    }
}