//竟然不讓我用 arraylist 來存，只能用 array
import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double point[][] = new Double[10][4];
        int size = 0;

        while(!sc.next().equals("*")){
            point[size][0] = sc.nextDouble();
            point[size][1] = sc.nextDouble();
            point[size][2] = sc.nextDouble();
            point[size][3] = sc.nextDouble();

            size++;
        }

        int pt = 1;

        while(sc.hasNext()){
            Double a = sc.nextDouble();
            Double b = sc.nextDouble();

            if(a == 9999.9 && b == 9999.9) break;

            boolean found = false;

            for(int i=0; i<size; i++){
                if(a > point[i][0] && a < point[i][2] && b < point[i][1] && b> point[i][3]) {
                    found = true;
                    System.out.printf("Point %d is contained in figure %d%n", pt, i+1);
                }
            }

            if(!found) System.out.printf("Point %d is not contained in any figure%n", pt);

            pt ++;
        }
    }
}