//https://a7069810.pixnet.net/blog/post/395755702-%5Buva11005%5D-cheapest-base

import java.util.*;

class p10466 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean first = true;

        int cases = sc.nextInt();
        for(int n=1; n<=cases; n++){
        	if(!first) System.out.println();

        	System.out.println("Case "+ n + ":");

        	int money[] = new int[36];
        	for(int i=0; i<36; i++){
        		money[i] = sc.nextInt();
        	}

        	int changeSize = sc.nextInt();
        	int change[] = new int[changeSize];
        	for(int i=0; i<changeSize; i++){
        		change[i] = sc.nextInt();
        	}

        	for(int i=0; i<changeSize; i++){
        		int totalMoney[] = new int[37];

        		//進位值轉換，從 2 到 36
        		for(int j=2; j<37; j++){
        			for(int k=0; k<changeSize; k++){
        				int changeTmp = change[k];
        				while(changeTmp>0){
        					int tmp = changeTmp % j;
        					changeTmp /= j;
        					totalMoney[j] += money[tmp];
        				}
        			}
        		}

        		//找出最少的錢，一開始先預設是第一個，也就是上面的 j
        		int minMoney = totalMoney[2];
        		for(int j=3; j<37; j++){
        			if(totalMoney[j] < minMoney) minMoney = totalMoney[j];
        		}

        		System.out.print("Cheapest base(s) for number " + change[i] + ":");
        		for(int j=2; j<37; j++){
        			if(totalMoney[j] == minMoney) System.out.print(" "+j);
        		}
        		System.out.println();
        	}
        	first = false;
        }
    }
}