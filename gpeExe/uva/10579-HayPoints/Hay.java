import java.util.Scanner;
import java.util.HashMap;

class Hay{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            HashMap<String,Integer> hm = new HashMap<String,Integer>(); //创建 hashmap 當做字典
            int m = sc.nextInt(); //字典的條數
            int n = sc.nextInt(); //文章數量
            

            for(int i=0; i<m; i++){
                hm.put(sc.next(), sc.nextInt()); //把接下來的每一行字放到字典裡面去
            }

            for(int j=0; j<n; j++){
                String str; //存讀取到的子串
                int sum = 0;
                while(!(str = sc.next()).equals(".")){
                    if(hm.containsKey(str)){
                        sum += hm.get(str);
                    }
                }
                System.out.println(sum);
            }
        }
    }
}