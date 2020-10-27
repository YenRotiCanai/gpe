import java.util.Scanner;

public class p11009_AllinAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            char c1[] = sc.next().toCharArray();
            char c2[] = sc.next().toCharArray();
            int k = 0;
            
            for(int i=0; i<c2.length; i++){
                if(c2[i] == c1[k]){
                    k++;
                    if(k==c1.length) break;
                }
            }

            if(k == c1.length) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
