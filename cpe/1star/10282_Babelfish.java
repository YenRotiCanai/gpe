//直接做 hashmap
//吃測資的時候要注意用 while(true)
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> hm = new HashMap<String, String>();

        //如果不知道有多少行，可是要吃換行進入下一個 part 的話，要用 while(true)
        //不可以用 sc.hasNext()
        while(true){
            String str = sc.nextLine();
            if(str.equals("")) break;

            String strArr[] = str.split(" ");
            hm.put(strArr[1], strArr[0]);
        }

        while(sc.hasNext()){
            String input = sc.nextLine();
            if(hm.containsKey(input)) System.out.println(hm.get(input));
            else System.out.println("eh");
        }
    }
}