//https://a7069810.pixnet.net/blog/post/393527026-%5Buva10281%5D-average-speed
//gpe WA, vJ & oJ AC
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double km=0, v=0, time=0, prevtime=0, h2s=0, m2s=0, s=0;

        while(sc.hasNextLine()){
            int i=0;
            String str[] = sc.nextLine().split(" ");

            while(str[i].equals("")) i++;

            String timeStr[] = str[i].split(":");

            h2s = Double.parseDouble(timeStr[0])*3600;
            m2s = Double.parseDouble(timeStr[1])*60;
            s = Double.parseDouble(timeStr[2]);
            time = h2s + m2s + s;

            km += (time - prevtime) * v / 3600;

            prevtime = time;

            if(str.length==1){
                System.out.printf("%s %.2f km%n", str[0], km);
            }else v = Double.parseDouble(str[i+1]);
        }
    }
}