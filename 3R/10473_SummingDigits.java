import java.util.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String str = sc.next();

            if(str.equals("0")) break;

            while(str.length() > 1){
                int sum = 0; //這邊清零
                
                for(int i=0; i<str.length(); i++){
                    sum += str.charAt(i)-'0';
                }
                str = Integer.toString(sum);
            }
            System.out.println(str);
        }
	}
}