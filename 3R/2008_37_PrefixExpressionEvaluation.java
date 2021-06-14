//java switch string 只能在 java 7 以上
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals(".")) break;

			String arr[] = str.split(" ");

			Stack<Integer> st = new Stack<Integer>();
			Boolean illegal = false;

			for(int i=arr.length-1; !illegal && i>=0; i--){

				if(!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/") && !arr[i].equals("%")){
					st.push(Integer.valueOf(arr[i]));
				}else{

					if(st.size() < 2){
						illegal = true;
						break;
					}

					int op1 = st.pop();
					int op2 = st.pop();

					if(arr[i].equals("+")) st.push(op1 + op2);
					else if(arr[i].equals("-")) st.push(op1 - op2);
					else if(arr[i].equals("*")) st.push(op1 * op2);
					else if(arr[i].equals("/")) st.push(op1 / op2);
					else if(arr[i].equals("%")) st.push(op1 % op2);
				}
			}

			System.out.println(illegal? "illegal":st.pop());
		}
	}
}