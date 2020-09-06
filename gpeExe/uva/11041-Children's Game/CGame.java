//宣告一個 comparator 來比較兩個數
//然後回傳到 main，用 arrays.sort排序
//最後把它從後面 print 出來

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class ChildrenGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        while((n=sc.nextInt())!= 0){ //注意：不可以在迴圈外面抓 n 的 input，不然他會是死的，每次就只有 n 次。應該要在迴圈這邊才可以。
            String arr[] = new String[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.next();
            }
            //System.out.println(Arrays.toString(arr));
            
            Arrays.sort(arr, new Cmp());

            for(int j = arr.length-1; j>=0; j--){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
class Cmp implements Comparator<String>{
    public int compare(String s1, String s2){
        String str1 = s1+s2;
        String str2 = s2+s1;

        return str1.compareTo(str2);
    }
}