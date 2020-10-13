import java.util.Scanner;

class p10567 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int Arr1[] = new int[123];
            int Arr2[] = new int[123];

            for(int i=0; i<s1.length(); i++){
                Arr1[s1.charAt(i)]++;
            }

            for(int i=0; i<s2.length(); i++){
                Arr2[s2.charAt(i)]++;
            }

            for(int k=97; k<123; k++){
                for(int num=1; num<=Math.min(Arr1[k],Arr2[k]); num++){
                    System.out.print((char)k);
                }
            }
            System.out.println();
        }
    }    
}
