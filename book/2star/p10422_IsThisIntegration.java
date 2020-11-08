//https://a7069810.pixnet.net/blog/post/395133313-%5Buva10209%5D-is-this-integration%3F

import java.util.Scanner;

public class p10422_IsThisIntegration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double w = sc.nextDouble();

            double a = w*w - (w*w*Math.PI/6) - (w*w*Math.sqrt(3)/4);
            double b = w*w - (w*w*Math.PI/4) - (2*a);
            double c = w*w - 4*a - 4*b;

            System.out.printf("%.3f %.3f %.3f", c, 4*b, 4*a);
            System.out.println();
        }
        sc.close();
    }
}
