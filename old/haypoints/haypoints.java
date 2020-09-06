import java.util.Scanner; //for使用者輸入用
import java.util.HashMap; //類似python的dict功能

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.hasNext()){
      HashMap<String, Integer> hm = new HashMap<String, Integer>(); //創建hashmap
      int m = in.nextInt(); //number of word in dictionary
      int n = in.nextInt(); //number of job description

      //先把東西存到字典裡面
      for(int i=0; i<m; i++){
        hm.put(in.next(), in.nextInt());
      }
      //System.out.println("HashMap 裡面有: "+hm); 
      //測試print hashmap 裡面的東西出來看看而已
      
      //接下來做每一個字的比對
      for(int i=0; i<n; i++){ //有幾段就跑幾段的loop
        String str;
        int sum=0;
        while(!(str=in.next()).equals(".")){ //當下一個字串不等於 . 的時候，往下走
          if(hm.containsKey(str)){ //如果字典裡面有這個字
            sum += hm.get(str); //就把這個字的價值加到sum裡面進去
          }
        }
      //最後把他印出來
      System.out.println(sum);
      }
    }
  }
}