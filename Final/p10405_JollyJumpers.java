//https://a7069810.pixnet.net/blog/post/391276504-%5Buva10038%5D-jolly-jumpers

package _Final;
import java.util.Scanner;
import java.util.Arrays;

class p10405_JollyJumpers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int cases = sc.nextInt();

            //先用一個陣列把測資存起來
            int arr[] = new int[cases];
            for(int i=0; i<cases; i++){
                arr[i] = sc.nextInt();
            }

            //用來記錄判斷
            boolean flag = true;

            //如果他不是只有 1 個 case 的話，就繼續
            //因為如果只有 1 個 case，那他就是 jolly
            if(cases != 1){
                //宣告 1 個新的陣列來放兩個值之間的差
                int arrD[] = new int[cases-1];
                for(int i=0; i<arr.length-1; i++){
                    arrD[i] = Math.abs(arr[i]-arr[i+1]);
                }

                //先排序
                Arrays.sort(arrD);

                //看新陣列裡面的差是不是遞增，不是就 false 然後跳出
                for(int i=0; i<arrD.length; i++){
                    if(arrD[i]!=i+1){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
        sc.close();
    }    
}
