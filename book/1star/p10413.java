//https://a7069810.pixnet.net/blog/post/391053376-uva10093-an-easy-problem

import java.util.Scanner;

class p10413{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st;

		while(sc.hasNext()){
			st = sc.nextLine();

			char[] Ctemp = st.toCharArray();
			int sum = 0;
			int max = 1;
			for(char temp:Ctemp){
				int R = 0;

				//這裏可以用兩種寫法，看是要用數字還是直接用abc
				//第一種：
				// if(temp>=48 && temp<=57) R = temp-48;
				// else if(temp>=65 && temp<=90) R = temp-55;
				// else if(temp>=97 && temp<=122) R = temp-61;

				//第二種：
				if(temp>='0' && temp<='9') R = temp-'0';
				else if(temp>='A' && temp<='Z') R = temp-'A'+10;
				else if(temp>='a' && temp<='z') R = temp-'a'+36;

				sum = sum + R;
				if(R > max) max = R;
			}

			for(int i=max; i<=62; i++){
				if(i==62){
					System.out.println("such number is impossible!");
					break;
				}
				if(sum%i==0){
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}