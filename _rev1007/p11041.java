import java.util.*;

class p10566{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;

		while(sc.hasNext()){
			n = sc.nextInt();
			if(n==0) break;

			String arr[] = new String[n];
			for(int i=0; i<n; i++){
				arr[i] = sc.next();
			}

			Arrays.sort(arr, new Cmp());

			for(int j=arr.length-1; j>=0; j--){
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
}

class Cmp implements Comparator<String>{
	public int compare(String s1, String s2){
		String str1 = s1+s2;
		String str2 = s2+s1;

		return str1.compareTo(str2);
	}
}