import java.util.*;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            int arr[] = new int[n];

            int count = 0;

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();

                for(int j=i-1; j>=0; j--){

                    if(arr[j] > arr[i]) count++;
                }
            }
            System.out.println("Minimum exchange operations : "+count);
        }
    }
}