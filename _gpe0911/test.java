import java.util.*;
public class main{
    public static void main(String[] args) {
       
            String s, t;
            Scanner in = new Scanner(System.in);
         
            while(in.hasNext()){
           
             s = in.next();
             t = in.next();
             boolean no = false;
         
             if(t.indexOf(s.charAt(0)) == -1){
              System.out.println("No");
             }
             else{
              for(int i = 0, k = 0; i < s.length(); i++){
               for(int j = k; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j))
                {
                 k = j + 1;
                 break;
                }
               
                if(j == t.length() - 1){
                 no = true;
                 break;
                }
               }
              }
              if(!no)
               System.out.println("Yes");
              else
               System.out.println("No");
             }

            }
    }
};
