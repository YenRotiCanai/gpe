import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		char arr[][] = new char[3][3];
		for(int i=0; i<3; i++){
			String s = sc.nextLine();
			for(int j=0; j<3; j++){
				arr[i][j] = s.charAt(j);
			}
		}

		System.out.println(ox(arr));
	}

	static String ox(char[][] arr){
		//-->
		for(int i=0; i<3; i++){
			if(arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2])
				return String.valueOf(arr[i][0]);
		}

		for(int i=0; i<3; i++){
			if(arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i])
				return String.valueOf(arr[0][i]);
		}

		if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2])
			return String.valueOf(arr[0][0]);

		if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0])
			return String.valueOf(arr[0][2]);

		return "DRAW";
	}
}