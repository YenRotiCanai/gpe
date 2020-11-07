import java.util.Scanner;
import java.math.BigDecimal;

class pTheTrip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==0) break;
            
            double arr[] = new double[n];
            BigDecimal h = new BigDecimal("100");
            int sum = 0;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextBigDecimal().multiply(h).intValueExact();
                sum += arr[i];
            }

            double avg = (double)sum / (double)n;
            double diff1 = 0, diff2 = 0;

            for(int i=0; i<n;i++){
                if(avg>arr[i]) diff1 += Math.floor(avg-arr[i]);
                else diff2 += Math.floor(arr[i]-avg);
            }

            if(diff1>diff2) System.out.printf("$%.2f%n",diff1/100);
            else System.out.printf("$%.2f%n",diff2/100);
        }
        sc.close();
    }
}
