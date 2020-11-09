import java.util.*;
class p10527{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10001];
		int count = 1;

		while(sc.hasNext()){
			arr[count] = sc.nextInt();

			for(int i=1; i<count; i++){
				if(arr[count] <= arr[i]){
					int tmp = arr[i];
					arr[i] = arr[count];

					for(int j=i; j<count; j++){
						int tmp2 = arr[j+1];
						arr[j+1] = tmp;
						tmp = tmp2;
					}
					break;
				}
			}
			if(count % 2 == 1 ) System.out.println(arr[count/2 + 1]);
			else{
				long a = arr[count/2];
				long b = arr[count/2+1];

				System.out.println((a+b)/2);
			}
			count++;
		}
	}
}