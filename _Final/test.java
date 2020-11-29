import java.util.Scanner;

class uva10642{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++){
            int x1=sc.nextInt(),y1=sc.nextInt();
            int x2=sc.nextInt(),y2=sc.nextInt();
            
            long count=0; //雖然輸入的點不會超過int的範圍，但是距離會，所以需要用到long。
            //(0,0)→到第一個點的距離(相減)。
            for(int j=0;j<(x1+y1);j++){
                count=count-j-1;
            }
            count=count-x1-1;
            
            //(0,0)→到第二個點的距離(相加)。
            for(int j=0;j<(x2+y2);j++){
                count=count+j+1;
            }
            count=count+x2+1;
            
            System.out.println("Case "+(i+1)+": "+count);
        }
    }
}