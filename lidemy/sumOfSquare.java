import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		int arr[] = new int[1000001];

		for(int i=1; i<arr.length; i++){
			arr[i] = i*i;
		}

		int n = sc.nextInt();
		int index = 1, sum=0;
		while(n > arr[index]){
			sum+=arr[index];
			index++;
		}
		System.out.println(sum);
	}
}