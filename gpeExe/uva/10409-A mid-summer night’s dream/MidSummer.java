import java.util.Scanner;
import java.util.Arrays;

class MidSummer {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  while(sc.hasNext()){
		  int cases = sc.nextInt();

		  int arr[] = new int[cases];
		  for(int i=0; i<arr.length; i++){
			  arr[i] = sc.nextInt();
		  }
		  Arrays.sort(arr); //先排序
		//  System.out.println(Arrays.toString(arr));

		  // A 中位数
		  int mid = arr[(arr.length-1)/2];
		  int mid2 = arr[(arr.length)/2];
		//   System.out.println("mid: "+mid);
		//   System.out.println("mid2: "+mid2);

		  // 相同数字 / 同是中位数
		  int count=0;
		  for(int i=0; i<arr.length; i++){
			  if(arr[i]==mid || arr[i]==mid2) count++;
		  }

		  // 有幾種可能
		  int D = mid2-mid+1; //eg.5,6,7,8 mid=6, mid2=7, possible=6,7 so D = 6-7 +1

		  System.out.println(mid+" "+count+" "+D);
	  }
  }
}