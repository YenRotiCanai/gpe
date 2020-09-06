//答案是 從2開始的(n-1)+(n-2)，所以可以做一個陣列先儲存，然後直接查表
/*費氏數列
3 = 2 + 1
5 = 4 + 3
n = ( n-1 ) + ( n-2 )
所以先把50個都算好存起來
再看他要哪一個就把哪一個叫出來
*/

import java.util.Scanner;
class Brick{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[51]; //用long來儲存事先計算好的答案，因為陣列第一個是 0 ，所以要宣告多一個
        arr[0] = 1; //前面兩個一定是 1
        arr[1] = 1;

        for(int i =2; i<51; i++){ //要從 2 開始
            arr[i] = arr[i-1]+arr[i-2];
        }

        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==0) break;
            else System.out.println(arr[n]);
        }
    }
}