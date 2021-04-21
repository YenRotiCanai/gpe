import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            double ans = n*1.5;
            System.out.println((int)ans);
        }
	}
}

/*

import java.util.Scanner;

class Cola2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int Owned = sc.nextInt();
			int totalBottle = 0;
			
			if(Owned <= 1){
				//System.out.println(Owned);
			}else{
				totalBottle = Owned;
				while(Owned != 1){
					if(Owned == 2){
						Owned++;
					}
					//System.out.println("O1: "+ Owned);
					totalBottle = totalBottle + (Owned/3);
					//System.out.println("t1: "+totalBottle);
					Owned = Owned % 3 + Owned/3;
					//System.out.println("O2: "+ Owned + '\n');
				}
				System.out.println(totalBottle);
			}
		}
  }
}

*/