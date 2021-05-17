//https://computerworld.mushiyo.cf/2014/01/uva409-excuses-excuses.html
//用 set 來keyword，用 array 來存字串和keyword 的出現次數
//split 要用 "\\W+"，去掉不是 word 的東西
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int set = 1;
        while(sc.hasNext()){
            int keyNum = sc.nextInt();
            int execuseNum = sc.nextInt();

            HashSet<String> keywords = new HashSet<String>();

            for(int i=0; i<keyNum; i++){
                keywords.add(sc.next());
            }
            sc.nextLine();

            //System.out.println(keywords);

            String excuses[] = new String[execuseNum];
            int count[] = new int[execuseNum];
            int max = 0;
            for(int i=0; i<execuseNum; i++){
                excuses[i] = sc.nextLine();
                String words[] = excuses[i].toLowerCase().split("\\W+");

                for(int j=0; j<words.length; j++){
                    if(keywords.contains(words[j])) count[i]++; 
                }
                max = Math.max(max, count[i]);
            }

            System.out.println("Excuse Set #"+set);

            for(int i=0; i<execuseNum; i++){
                if(count[i] == max) System.out.println(excuses[i]);
            }
            System.out.println();
            set++;
        }
    }
}