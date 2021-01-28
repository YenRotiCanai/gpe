import java.util.Scanner;
import java.util.Vector;

class uva490{
  public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    Vector<String> vector=new Vector<String>(); //使用Vector存放字串。也可以用陣列存，但是考慮的點會比較多。
    
    int cases=0; //有多少行字串
    int maxLength=0; //最長字串長度。
    
    //讀取字串
    while(sc.hasNextLine()){
      String st=sc.nextLine();
      if(st.length()>maxLength)maxLength=st.length();
      vector.add(st);
      cases++;
    }
    
    int count=0; //計算需要多少空白。為了對應格式。
    
    //開始一個字一個字抓
    for(int i=0;i<maxLength;i++){
      count=0; //每次都需要初始化，否則可能會不小心用到上次迴圈的資料。
      for(int j=cases-1;j>=0;j--){
        if(!(i>=vector.get(j).length())){ //當某行字串結束時，不再印出字。
          while(count>0){
            System.out.print(" ");
            count--;
          }
          System.out.print(vector.get(j).charAt(i)); //印出字
          count=0;
        }else{
          count++; //計算需要多少空白對應格式。
        }
      }
      System.out.println("");
    }
  }
}