import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long ans[] = new long[50001];
        for(int i=1; i<50001; i++){
            ans[i] = ans[i-1] + (long)i*i*i;
        }

        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(ans[n]);
        }
    }
}