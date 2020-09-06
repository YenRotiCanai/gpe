//timed out

import java.util.Scanner;
class Minesweeper{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int field = 0, h, w;
        while(sc.hasNext() && (h=sc.nextInt())!=0 && (w=sc.nextInt())!=0 ){
            if(field != 0) System.out.println("");
            char arr[][] = new char[h][w];

            for(int i=0; i<h; i++){
                String temp = sc.next();
                for(int j=0; j<w; j++){
                    arr[i][j] = temp.charAt(j);
                }
            }

            System.out.println("Field #"+(++field)+":");

            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    int ans = 0;

                    if(arr[i][j]=='*'){
                        System.out.print('*');
                    }else{
                        if(i-1>=0 && arr[i-1][j]=='*') ans++;
                        if(i+1<h && arr[i+1][j]=='*') ans++;
                        if(j-1>=0 && arr[i][j-1]=='*') ans++;
                        if(j+1<w && arr[i][j+1]=='*') ans++;

                        if((i-1>=0 && j-1>=0) && arr[i-1][j-1]=='*') ans++;
                        if((i-1>=0 && j+1<w) && arr[i-1][j+1]=='*') ans++;
                        if((i+1<h && j+1<w) && arr[i+1][j+1]=='*') ans++;
                        if((i+1<h && j-1>=0) && arr[i+1][j-1]=='*') ans++;

                        System.out.print(ans);
                    }
                }
                System.out.println("");
            }
        }
    }
}