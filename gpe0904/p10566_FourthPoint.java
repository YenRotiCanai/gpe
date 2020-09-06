import java.util.Scanner;

class p10566{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
            double y4 = sc.nextDouble();
            
            if(x1 == x3 && y1 == y3) System.out.printf("%.3f %.3f%n", (x2+x4)-x1, (y2+y4)-y1);
            else if(x1 == x4 && y1 == y4) System.out.printf("%.3f %.3f%n", (x2+x3)-x1, (y2+y3)-y1);
            else if(x2 == x3 && y2 == y3) System.out.printf("%.3f %.3f%n", (x1+x4)-x2, (y1+y4)-y2);
            else System.out.printf("%.3f %.3f%n", (x1+x3)-x2, (y1+y3)-y2);
        }
    }
}