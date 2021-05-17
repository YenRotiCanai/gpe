import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        boolean first = true;
        
        while(cases-->0){
            //不知道他這為什麼要吃兩次
            sc.nextLine();
            sc.nextLine();
            String idxArr[] = sc.nextLine().split(" ");
            String valueArr[] = new String[idxArr.length];

            for(int i=0; i<idxArr.length; i++){
                int index = Integer.parseInt(idxArr[i]);
                valueArr[index-1] = sc.next();
            }

            if(!first) System.out.println();
            for(String s:valueArr) System.out.println(s);
            first = false;
        }
    }
}