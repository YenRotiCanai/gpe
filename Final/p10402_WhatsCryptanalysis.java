package _Final;

import java.util.Scanner;

class p10402_WhatsCryptanalysis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char c;
        int len = 0;
        int arr[] = new int[300];
        String s;

        int n = Integer.parseInt(sc.nextLine());

        while(n-->0){
            s = sc.nextLine();

            for(int i=0; i<s.length(); i++){
                c = s.toUpperCase().charAt(i);
                arr[c]++;
                len++;
            }
        }

        while(--len>0){
            for(c='A'; c<='Z'; c++){
                if(len == arr[c]) System.out.println(c+" "+len);
            }
        }
        sc.close();
    }
}
