//https://github.com/UMassACM/programming-challenges/blob/master/uva/10137/Main.java

import java.util.*;

class p10533{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num_students = sc.nextInt(); //學生人數
			if(num_students == 0) break;

			double payments[] = new double[num_students];
			double sum = 0;
			for(int i=0; i<num_students; i++){
				payments[i] = sc.nextDouble(); //款項
				sum += payments[i]; //總額
			}

			double avg = sum / (double) num_students; //平均
			// System.out.println("avg:"+avg);

			avg = Math.round(avg*100.0) / 100.0;

			// System.out.println("Rounded avg:"+avg);

			double high=0, low = 0;
			for(int i=0; i<num_students; i++){
				double diff = payments[i] - avg;

				if(diff < 0) low -= diff;
				else high -= diff;
				
				// System.out.println(i+". diff:" + diff +" ,high:"+high+" ,low:"+low);
			}

			double change;
			if(low > high) change = low;
			else change = high;

			System.out.printf("$%.2f\n",change);
		}
	}
}