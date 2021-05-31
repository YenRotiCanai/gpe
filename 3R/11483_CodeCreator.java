//可以先把答案存起來再一次過吐出來
//也可以一邊吃一邊吐

//要先換掉有 “斜線” 的，再來換 “雙引號”
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int cases = 1;
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;
			sc.nextLine();

			String strArr[] = new String[n];
			for(int i=0; i<n; i++){
				sb.setLength(0);
				sb.append("printf(\"");
				
				String str = sc.nextLine();
				str = str.replace("\\", "\\\\");
				str = str.replace("\"", "\\\"");
				sb.append(str);
				sb.append("\\n\");");
				strArr[i] = sb.toString();
			}

			System.out.printf("Case %d:\n", cases);
			System.out.println("#include<string.h>");
			System.out.println("#include<stdio.h>");
			System.out.println("int main()");
			System.out.println("{");

			for(int i=0; i<n; i++){
				System.out.println(strArr[i]);
			}
			
			System.out.println("printf(\"\\n\");");
			System.out.println("return 0;");
			System.out.println("}");


			cases++;
		}
	
	}
}