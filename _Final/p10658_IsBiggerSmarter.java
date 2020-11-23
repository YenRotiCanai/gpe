package _Final;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class p10658_IsBiggerSmarter{

    public static class Elephant implements Comparable<Elephant>{
        int weight, iq, id;

        public int compareTo(Elephant e){
            return this.weight-e.weight;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Elephant> list = new ArrayList<>();
        int idCount = 1;

        String s;
        while(sc.hasNext()){
            Elephant e = new Elephant();
            e.weight = sc.nextInt();
            e.iq = sc.nextInt();
            e.id = idCount++;
            list.add(e);

            //System.out.println(list.toString());
        }

        Elephant [] eArr = list.toArray(new Elephant[list.size()]);     
        
        Arrays.sort(eArr);
        //System.out.println(Arrays.toString(eArr));

        int[] lis = new int[eArr.length];
        lis[0] = 1;
        for(int i=1; i<lis.length; i++){
            lis[i] = Math.max(1, lis[i]);
            for(int i2=0; i2<i; i2++){
                if(eArr[i].iq < eArr[i2].iq && eArr[i].weight > eArr[i2].weight){
                    lis[i] = Math.max(lis[i2]+1, lis[i]);
                }
            }
        }

        int max = 0;
        for(int i : lis){
            max = Math.max(i,max);
        }

        System.out.println(max);
        int[] solution = new int[max];

        boolean first = true;
        int last = 0;
        for(int i=lis.length-1; i>=0 && max>0; i--){
            if(lis[i]==max && (first || last < eArr[i].iq)){
                last = eArr[i].iq;
                solution[--max] = eArr[i].id;
                first = false;
            }
        }

        for(int i=0; i<solution.length; i++){
            System.out.println(solution[i]);
        }

    }
}
