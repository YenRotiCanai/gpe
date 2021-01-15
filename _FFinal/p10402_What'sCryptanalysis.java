import java.util.Scanner;

class FFtest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int arr[] = new int[150];
		char c;
		int count = 0;

		while(n-->0){
			String str = sc.nextLine();
			for(int i=0; i<str.length(); i++){
				c = str.toUpperCase().charAt(i);
				arr[c]++;
				count ++;
			}
		}

		//這個要先 --count，不然用 count -- 的話後面會有一堆 0
		//輸出的時候，因為已經在for裡面宣告 c 是 字母了，所以不用特別轉成 char
		while(--count>0){
			for(c = 'A'; c<='Z'; c++){
				if(count == arr[c]) System.out.println(c + " " + count);
			}
		}

	}
}