import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //這個要放外面，因為他會一直吃到 EOF 
        //裡面全部都算成是一筆測資
        boolean first = true; 
        
        while(sc.hasNext()){
            String str = sc.nextLine();
            while(str.contains("\"")){
                if(first) str = str.replaceFirst("\"","``");
                else str = str.replaceFirst("\"","''");

                first = !first;
            }
            System.out.println(str);
        }
    }
}