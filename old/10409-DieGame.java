import java.util.Scanner;

class DieGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases;

        while(sc.hasNextInt() && ( cases=sc.nextInt() ) !=0 ){ //當輸入不等於0的時候

            int Top = 1;
            int N = 2, W = 3, E = 4, S = 5;

            for(int i=0;i<cases; i++){
                String turn = sc.next();
                if(turn.equals("north")){ //往前轉
                    N = Top; 
                    Top = S;
                    S = 7-N;
                }else if(turn.equals("south")){
                    S = Top;
                    Top = N;
                    N = 7-S;
                }else if(turn.equals("west")){
                    W = Top;
                    Top = E;
                    E = 7-W;
                }else if(turn.equals("east")){
                    E = Top;
                    Top = W;
                    W = 7-E;
                }
            }
            System.out.println(Top);
        }
        sc.close();
    }
}