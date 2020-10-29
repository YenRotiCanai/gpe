import java.util.*;

public class p10559_ILoveBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans[] = new int[1001];
        int pd[] = new int[3001];
        pd[0] = 1;
        for(int i=1; i<3001; i++){
            pd[i] = 1;
        }

        for(int n=1; n<=10; n++){
            System.out.println("n:"+n);
            for(int k=0; k<10; k++){
                pd[k]*=n;
                System.out.printf("pd1[%d]:%d%n",k,pd[k]);
            }

            for(int k=0; k<10; k++){
                pd[k+1] = pd[k]/10;
                pd[k]%=10;
                System.out.printf("pd2[%d]:%d%n",k,pd[k]);
            }
            for(int k=0; k<3000; k++) ans[n] += pd[k];
        }
        //System.out.println(Arrays.toString(pd));

        
        while(sc.hasNext()){
            int a = sc.nextInt();
            System.out.println(ans[a]);
        }
        sc.close();
    }
}