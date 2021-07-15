import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int N = sc.nextInt();
            sc.nextLine();
            int arr[] = new int[N];
            int A = 0;
            int C = 0;

            //System.out.println("N:" + N);

            for(int i=0; i<N; i++){
                A = sc.nextInt();
                C = sc.nextInt();

                //System.out.println("A:" + A + "C:" + C);
                sc.nextLine();
                arr[i] = C;
            }

            Arrays.sort(arr);

            int cases = sc.nextInt();
            while(cases-->0){
                boolean complete = false;
                int vr = sc.nextInt();
                int ans = 0;
                int bought = 0;
                //System.out.println("vr:" + vr);

                for(int i=0; i<N; i++){
                    ans += arr[i];
                    bought += A;

                    //System.out.println("ans:" + ans + " bought:" + bought);

                    if(bought >= vr){
                        complete = true;
                        break;
                    }
                }

                if(complete) System.out.println(ans);
                else System.out.println("0");
            }          
        }
    }
}