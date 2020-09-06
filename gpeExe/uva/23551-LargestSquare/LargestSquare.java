import java.util.Scanner;
class LargestSquare{

    static int m, n, count;
    static char center, map[][];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int cases = sc.nextInt();

            for(int i=0; i<cases; i++){
                m = sc.nextInt();
                n = sc.nextInt();
                int q = sc.nextInt();
                map = new char[m][n];

                for(int j=0; j<m; j++){
                    String s = sc.next(); //讀取一整行的字母
                    for(int k=0; k<n; k++){
                        map[j][k] = s.charAt(k); //把每一行的字母拆分到陣列裡面
                    }
                }
                System.out.println(m+" "+n+" "+q);

                for(int g=0; g<q; g++){ //處理按照題目給的坐標（就是最後那幾組數字），找出他們的寬度
                    int r = sc.nextInt();
                    int c = sc.nextInt();
                    count = 1; //先設定 count = 1
                    center = map[r][c]; //設定中心點是自己
                    run(r-1,r+1,c-1,c+1);
                    System.out.println(count);
                }
            }
        }
    }
    static int run(int top, int down, int left, int right){
        if(top<0 || down>=m || left<0 || right>=n) return 0;
        for(int i=left; i<=right; i++){
            if(map[top][i]!=center || map[down][i]!=center) return 0;
        }
        for(int j=top; j<=down; j++){
            if(map[j][left]!=center || map[j][right]!=center) return 0;
        }
        count+=2;
        return run(top-1, down+1, left-1, right+1);
    }
}