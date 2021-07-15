import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][3];

        //int a = 1, b=2, c=3;
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = i;
            }
        }

        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        Arrays.sort(arr);

        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
