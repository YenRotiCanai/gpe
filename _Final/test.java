package _Final;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int cases = sc.nextInt();

			int arr[] = new int[cases];
			for(int i=0; i<cases; i++){
				arr[i] = sc.nextInt();
			}

			boolean flag = true;

			if(cases!=1){
				int arrD[] = new int[cases-1];
				for(int i=0; i<arr.length-1; i++){
					arrD[i] = Math.abs(arr[i]-arr[i+1]);
				}

				Arrays.sort(arrD);

				for(int i=0; i<arrD.length; i++){
					if(arrD[i]!=i+1){
						flag = false;
						break;
					}
				}
			}
			if(flag) System.out.println("Jolly");
			else System.out.println("Not jolly");
		}

		sc.close();
	}
	
	
}