import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double[]> pointList = new ArrayList<Double[]>();

        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.equals("*")) break;

            String pt[] = str.split(" ");
            Double dArr[] = new Double[4];
            for(int i=0; i<4; i++){
                dArr[i] = Double.parseDouble(pt[i+1]);
            }

            pointList.add(dArr);
        }

        int point = 1;

        while(sc.hasNext()){
            Double a = sc.nextDouble();
            Double b = sc.nextDouble();

            if(a == 9999.9 && b == 9999.9) break;

            boolean found = false;

            for(int i=0; i<pointList.size(); i++){
                // Double x1 = pointList.get(i)[0];
                // Double y1 = pointList.get(i)[1];
                // Double x2 = pointList.get(i)[2];
                // Double y2 = pointList.get(i)[3];

                // if(a > x1 && a < x2 && b < y1 && b> y2) {
                //     found = true;
                //     System.out.printf("Point %d is contained in figure %d%n", point, i+1);
                // }

                if(a > pointList.get(i)[0] && a < pointList.get(i)[2] && b < pointList.get(i)[1] && b> pointList.get(i)[3]) {
                    found = true;
                    System.out.printf("Point %d is contained in figure %d%n", point, i+1);
                }

            }

            if(!found) System.out.printf("Point %d is not contained in any figure%n", point);

            point ++;
        }
    }
}