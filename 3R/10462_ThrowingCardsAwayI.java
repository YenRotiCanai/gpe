//用 arraylist 模擬

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==0) break;

            ArrayList<Integer> arr = new ArrayList<Integer>();

            for(int i=1; i<=n; i++){
                arr.add(i);
            }
            System.out.print("Discarded cards: ");

            System.out.print(arr.remove(0));
            arr.add(arr.remove(0));
            
            while(arr.size() > 1){
                System.out.print(", "+ arr.remove(0));
                arr.add(arr.remove(0));
            }

            System.out.printf("\nRemaining card: %d\n",arr.remove(0));
        }
    }
}
