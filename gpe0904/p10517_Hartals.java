import java.util.Scanner;
class p10517 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while((--cases)>=0){
            int d = sc.nextInt();
            int p = sc.nextInt();

            int days[] = new int[d+1];
            int party[] = new int[p];

            for(int i=0; i<p; i++){
                party[i] = sc.nextInt();
            }

            for(int i=0; i<p; i++){
                int multRec = 0;
                for(int j=1; j<d+1; j++){
                    multRec = party[i] * j;

                    if(multRec < d+1){
                        days[multRec] =1;
                    }else{
                        break;
                    }
                }
            }
        }
    }
}