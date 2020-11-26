import java.util.Scanner;
import java.util.Arrays;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean newLine = false;

		while(sc.hasNext()){

			if(newLine) System.out.println();
			
			String s = sc.nextLine();
			int arr[] = new int[130];
			int max = 0;

			for(int i=0; i<s.length(); i++) arr[s.charAt(i)]++;

			for(int i=0; i<arr.length; i++){
				if(arr[i] > max) max = arr[i];
			}

			for(int i=1; i<=max; i++){
				for(int j=arr.length-1; j>=0; j--){
					if(arr[j]==i) System.out.println(j+" "+arr[j]);
				}
			}

			newLine = true;
			
		}

		sc.close();
	}
	
	
}