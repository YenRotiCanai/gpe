//10404:Primary Arithmetic

import java.util.*;

class p10404 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int a = sc.nextInt();
        	int b = sc.nextInt();

        	if(a==0 && b==0) break;

        	boolean carry = false;
        	int cSum = 0;

        	while(a!=0 || b!=0){
                //拿兩個的個位數
        		int tmpA = a%10;
        		int tmpB = b%10;

                //個位數相加
        		int tmpSum = tmpA+tmpB;

        		if(carry){
        			tmpSum++;
        			carry = false;
        		}
				
        		if(tmpSum>9){
        			cSum++;
        			carry = true;
        		}

        		a/=10;
        		b/=10;
        	}

        	if(cSum==0) System.out.println("No carry operation.");
        	else if(cSum==1) System.out.println("1 carry operation.");
        	else System.out.println(cSum + " carry operations.");
        }
    }
}