//Josephus Problem
//https://knightzone.studio/2012/03/25/1522/uva%EF%BC%9A151%EF%BC%8Dpower-crisis/
//https://blog.csdn.net/u011500062/article/details/72855826

import java.util.Scanner;

class ChildrenGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, m, off;

		while(sc.hasNext() && (N=sc.nextInt())!=0){
            N--;
            
            //System.out.println("N: "+N);
            
			for(m=1; m<N; m++){
                off = 0;
                // System.out.println("m: "+m);
				for(int i=1; i<=N; i++){
                    off = (off+m)%i;
                    // System.out.println("off: "+off);
                }
                // System.out.println();
				if(off == 11) break;
			}
			System.out.println(m);
		}
	}
}