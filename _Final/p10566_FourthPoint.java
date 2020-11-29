//p10566_FourthPoint.java
//java 版解答：https://a7069810.pixnet.net/blog/post/394176769-%5Buva10242%5D-fourth-point%21%21
//比較簡單的解：http://mypaper.pchome.com.tw/zerojudge/post/1322850763

import java.util.Scanner;

class p10566 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextDouble()){
        	double x1=sc.nextDouble(), y1=sc.nextDouble();
        	double x2=sc.nextDouble(), y2=sc.nextDouble();
        	double x3=sc.nextDouble(), y3=sc.nextDouble();
        	double x4=sc.nextDouble(), y4=sc.nextDouble();

        	if(x1==x3 && y1==y3) System.out.printf("%.3f %.3f%n", (x2+x4)-x1, (y2+y4)-y1);
        	else if(x1==x4 && y1==y4) System.out.printf("%.3f %.3f%n", (x2+x3)-x1, (y2+y3)-y1);
        	else if(x2==x3 && y2==y3) System.out.printf("%.3f %.3f%n", (x1+x4)-x2, (y1+y4)-y2);
        	else System.out.printf("%.3f %.3f%n", (x1+x3)-x2,(y1+y3)-y2);
        }
    }
}