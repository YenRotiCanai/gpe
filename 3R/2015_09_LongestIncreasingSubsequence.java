import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int ans = LIS(n, arr);
            System.out.println(ans);
        }
	}

    public static int LIS(int n, int arr[]){
        int length[] = new int[n];
        if(n==0) return 0;
        Arrays.fill(length, 1); //把整個陣列填滿 1

        int longest = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]<arr[j])
                    length[j] = Math.max(length[j], length[i]+1);
            }
            if(longest < length[i]) longest = length[i];
        }
        return longest;
    }
}