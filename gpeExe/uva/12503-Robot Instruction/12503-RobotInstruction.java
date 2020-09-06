import java.util.Scanner;
import java.util.Arrays;

class Robot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int cases = sc.nextInt();

			for(int c=0; c<cases; c++){
				int instr = sc.nextInt();
				int arr[] = new int[instr+1];

				sc.nextLine();

				for(int i =1; i<=instr; i++){
					String s = sc.nextLine();

					if(s.equals("LEFT")){
						arr[i] = -1;
					}else if(s.equals("RIGHT")){
						arr[i] = 1;
					}else{
						String s2 = s.substring(8);
						int index = Integer.parseInt(s2);
						arr[i] = arr[index];
					}
				}
				//System.out.println(Arrays.toString(arr));

				int sum = 0;
				for(int i=1; i<=instr; i++){
					sum += arr[i];
				}
				//System.out.println("sum: "+sum);
				System.out.println(sum);
			}

		}

	}
}