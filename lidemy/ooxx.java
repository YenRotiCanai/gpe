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

		char a=arr[0][0], b=arr[0][1], c=arr[0][2],
			d=arr[1][0], e=arr[1][1], f=arr[1][2],
			g=arr[2][0], h=arr[2][1], i=arr[2][2];

		boolean draw = true;
		char win = ' ';

		
		if((a==b && b==c) || (a==d && d==g)){
			draw = false;
			win = a;
		}else if((c==f && f==i) || (i==h && h==g)){
			draw = false;
			win = i;
		}else if((a==e && e==i) || (c==e && e==g) || (d==e && e==f) || (b==e && e==h)){
			draw = false;
			win = e;
		}


		if(draw) System.out.println("DRAW");
		else System.out.println(win);
		// System.out.println(Arrays.deepToString(arr));
	}
}

//OR
/*
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
*/