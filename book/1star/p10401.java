//http://kpeggy.blogspot.com/2014/03/javafibonaccimal-base.html

import java.util.Scanner;
//import java.util.Arrays;

class p10401{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int f[] = new int[39]; //宣告陣列來存放事先算好的費氏數列
		 int n, m, index;
		 f[0] = 1;
		 f[1] = 1;

		 //先算好費氏數列，再把他放進陣列裡面
		 for(int i=2; i<=38; i++){
		 	f[i] = f[i-1]+f[i-2];
		 }

		 //System.out.println(Arrays.toString(f));

		 n = sc.nextInt(); //測資數量

		 for(int i=0; i<n; i++){
		 	m = sc.nextInt();
		 	index = f.length-1; //將index位置設定從最後一個位置開始

			//陣列起始位置不能大於 m
		 	while(m < f[index]) index--;

		 	System.out.print(m + " = ");

		 	for(int j=index; j>=1; j--){

		 		//System.out.println("j: "+j);

		 		if(m >= f[j]){
		 			System.out.print(1);
		 			m = m - f[j];
		 		}
		 		else System.out.print(0);
		 	}
		 	System.out.println(" (fib)");
		 }
	}
}