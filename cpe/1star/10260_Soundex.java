import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int map[] = { 
            0, 1, 2, 3, 0, 1, 2, 0, 0,
            2, 2, 4, 5, 5, 0, 1, 2, 6,
            2, 3, 0, 1, 0, 2, 0, 2
        };

        while(sc.hasNext()){
            String str = sc.nextLine();
            int prev = Integer.MAX_VALUE;
            for(int i=0; i<str.length(); i++){
                //找出該字母在 26 裡的位置
                int m = str.charAt(i)-'A'; 
                
                //對應到上面的 數字 array
                if(map[m]!=0 && map[m]!=prev){
                    System.out.print(map[m]);
                    prev = map[m];
                }else if(map[m]==0) prev = map[m];
            }
            System.out.println();
        }
    }
}