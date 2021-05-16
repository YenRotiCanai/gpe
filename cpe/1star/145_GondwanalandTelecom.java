//https://hellowalk.blogspot.com/2018/10/java-uva-145-gondwanaland-telecom.html
import java.util.*;
class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //登記費率
        double rate[][] = {
            {0.10, 0.06, 0.02},
            {0.25, 0.15, 0.05},
            {0.53, 0.33, 0.13},
            {0.87, 0.47, 0.17},
            {1.44, 0.80, 0.30}
        };
    
        while(sc.hasNext()){
            //這三個拿來算用電的時間
            int Day=0, Evening=0, Night=0;

            //把整個字串 split 開來變成 array
            String sArr[] = sc.nextLine().split(" ");
            if(sArr[0].equals("#")) break;

            //開一個陣列來記錄用電的時間
            boolean get[] = new boolean[1440];

            int index = sArr[0].charAt(0) - 'A';

            //把時間都換成分鐘
            int min1 = Integer.valueOf(sArr[2]) * 60 + Integer.valueOf(sArr[3]);
            int min2 = Integer.valueOf(sArr[4]) * 60 + Integer.valueOf(sArr[5]);

            //算他有沒有過夜（min1 > min2 代表有過夜）
            //如果沒有，就把 min1 到 min2 之間的 get[] boolean 都變成 true
            if(min1 < min2){
                for(int i = min1; i < min2; i++) get[i] = true;
            }else{
                //如果有過夜，就從 0 到 min2，min1 到 1440
                for(int i = 0; i < min2; i++) get[i] = true;
                for(int i = min1; i < 1440; i++) get[i] = true;
            }

            //每個時間區間都跑一次，如果在 get 的 boolean 陣列裡有標記的話，就代表那個時間有用電
            for(int i=0; i<480; i++) Night += (get[i]? 1:0);
            for(int i=480; i<1080; i++) Day += (get[i]? 1:0);
            for(int i=1080; i<1320; i++) Evening += (get[i]? 1:0);
            for(int i=1320; i<1440; i++) Night += (get[i]? 1:0);

            //把每個區間的時間記錄和用電費率加總起來，就是總花費
            double sum = rate[index][0] * Day + rate[index][1] * Evening + rate[index][2] * Night;

            //最後按照題目要的格式輸出，double 要記得用 .2f
            System.out.printf("%10s%6d%6d%6d%3s%8.2f\n", sArr[1], Day, Evening, Night, sArr[0], sum);
        }
    }
}