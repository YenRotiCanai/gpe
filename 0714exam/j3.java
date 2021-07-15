import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        while(sc.hasNext()){
            int N = sc.nextInt();
            int arr[][] = new int[N][3];

            for(int i=0; i<N; i++){
                int A = sc.nextInt();
                int C = sc.nextInt();

                arr[i][0] = A;
                arr[i][1] = C;
                arr[i][2] = 0;
            }
        }
    }
}
