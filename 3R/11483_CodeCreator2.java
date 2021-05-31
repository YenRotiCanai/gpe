//https://blog.xuite.net/b81621java/blog/189144990
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = 1;
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;
			sc.nextLine();
			System.out.printf("Case %d:\n", cases++);
			System.out.println("#include<string.h>\n#include<stdio.h>\nint main()\n{");

			for(int i=0; i<n; i++){
				String str = sc.nextLine();
				str = str.replace("\\","\\\\");
				str = str.replace("\"","\\\"");
				System.out.printf("printf(\"%s\\n\");\n",str);
			}

			System.out.println("printf(\"\\n\");\nreturn 0;\n}");
		}
	}
}