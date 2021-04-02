import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
       while(sc.hasNext()){
           String st = sc.next();

           if(st.equals("0")) break;

           int degree = 0;
           String tmp = st;

           while(true){
               int total = 0;

               for(int i=0; i<tmp.length(); i++){
                   total += tmp.charAt(i) - 48;
               }

               if(total % 9 == 0){
                   degree ++;
                   if(total == 9) break;
                   else tmp = Integer.toString(total);
               }else break;
           }

           if(degree != 0) System.out.println(st + " is a multiple of 9 and has 9-degree " + degree + ".");
           else System.out.println(st + " is not a multiple of 9.");
       }
	}
}