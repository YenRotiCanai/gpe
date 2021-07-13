////https://a7069810.pixnet.net/blog/post/393788563-%5Buva10279%5D-mine-sweeper
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        for(int i=0; i<cases; i++){
            if(i!=0) System.out.println();

            int n = sc.nextInt();
            char map[][] = new char[n][n]; //地圖 1
            char choose[][] = new char[n][n]; //地圖 2

            int aroundBomb[][] = new int[n][n]; //周圍炸彈的數量

            //上下左右，斜角等8個方位
            int direction[][] = {
                {0,1}, {0,-1}, {1,0}, {-1,0},{1,1}, {-1,-1}, {-1,1},{1,-1}
            };

            //讀地圖,吃String進來
            for(int j=0; j<n; j++){
                String st = sc.next();
                for(int k=0; k<n; k++){
                    map[j][k] = st.charAt(k);
                }
            }

            //讀玩家的 x
            for(int j=0; j<n; j++){
                String st = sc.next();
                for(int k=0; k<n; k++){
                    choose[j][k] = st.charAt(k);
                }
            }

            //計算點周圍的炸彈數量
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    int count = 0; //預設先給 0

                    //把每個點的上下左右走一遍後，有發現 * 的話就 count ++
                    for(int z=0; z<direction.length; z++){
                        int row = j+direction[z][0];
                        int col = k+direction[z][1];

                        if(row >= 0 && col >= 0 && row<n && col<n && map[row][col] == '*') count++;
                    }
                    aroundBomb[j][k] = count;
                }
            }

            //Output
            //拿原本的兩個地圖比較
            //1. 如果沒有地雷，就引出新地圖 aroundbomb 的值
            //2. 如果是地雷，就直接印出地雷
            //3. 兩個都不是，就引出 .
            //最後要換行
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(choose[j][k]=='x' && map[j][k]!='*')
                        System.out.print(aroundBomb[j][k]);
                    else if(choose[j][k]=='x' && map[j][k]=='*')
                        System.out.print("*");
                    else System.out.print(".");
                }
                System.out.println();
            }
        }
    }
}