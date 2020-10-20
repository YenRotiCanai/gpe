import java.util.*;  
  
public class Main {  
  
    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);  
       while(scn.hasNext()){
    	   String str=scn.nextLine();
    	   StringBuilder sub = new StringBuilder();
    	   if(str.equals("."))
    		   break;
    	   for(int i=0;i<str.length();i++){
    		   sub.append(str.charAt(i));
    		   if(str.length()%sub.length()!=0)
    			   continue;
    		   boolean b=true;
    		   for(int j=0;j<str.length();j+=sub.length()){
    			   if(!str.substring(j,j+sub.length()).equals(sub.toString())){
    				   b=false;
    				   break;
    			   }   
    		   }
    		   if(b)
    			   break;
    	   }
    	   System.out.println(str.length()/sub.length());
       }
    } 
}