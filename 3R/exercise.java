import java.util.*;
import java.math.BigInteger;

//GCD
/*
class GCD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = GCD(a, b);

		System.out.println(c);
	}

	public static int GCD(int x, int y){
		if(x % y == 0) return y;
		else return GCD(y, x%y);
	}
}
*/

//prime
/*
class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();

			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i=a; i<=b; i++){
				if(isPrime(i)) arr.add(i);
			}
			System.out.println(arr);
		}
	}
	public static boolean isPrime(int n){
		if(n==1) return false;
		for(int i=2; i<n; i++){
			if(n%i==0) return false;
		}
		return true;
	}
}
*/

//fibonacci
/*
class Fib{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		BigInteger fib[] = new BigInteger[5001];
		fib[0] = BigInteger.ZERO;
		fib[1] = BigInteger.ONE;

		for(int i=2; i<5001; i++){
			fib[i] = fib[i-1].add(fib[i-2]);
		}
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(fib[n]);
		}
	}
}
*/

//找個位數
/*
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			while(n>0){
				int m = n%10;
				System.out.println(m);
				n/=10;
			}
		}
	}
}
*/

//LCS
/*
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			int m = s1.length();
			int n = s2.length();

			int dp[][] = new int[m+1][n+1];

			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					char c1 = s1.charAt(i);
					char c2 = s2.charAt(j);

					if(c1 == c2) dp[i+1][j+1] = dp[i][j]+1;
					else dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
			System.out.println(dp[m][n]);
		}
	}
}
*/

//LIS
/*
class LIS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			int arr[] = new int[n];

			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}

			//開一個陣列來記錄每一筆測資的 lis 長度
			//先將他們預設成 1
			int length[] = new int[n];
			Arrays.fill(length, 1);

			int maxLen = 0;

			for(int i=0; i<arr.length; i++){
				int currNum = arr[i];

				//for loop 從 0 開始一直跑到 i，j 是 i 的前面
				for(int j=0; j<i; j++){
					int prevNum = arr[j];

					//如果 prev 小過 curr 且 j 的長度 +1 大於 i 的話
					//就表示他是 i 的其中一個 lis，所以 i 的長度就變成是 j長度 + 1
					if(prevNum < currNum && length[j]+1 >= length[i]) length[i] = length[j] + 1;
				}
				//只要 i 長度大於最長，就把最長改成 i 長度
				if(length[i] > maxLen) maxLen = length[i];
			}
			System.out.println(maxLen);
		}
	}
}
*/

//LIS v2(有輸出值的版本)
/*
import java.util.*;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			int array[] = new int[n];

			for(int i=0; i<n; i++){
				array[i] = sc.nextInt();
			}

            // 開一個陣列來放序列的 index 位置
            // 先將他們都填滿 MIN VALUE
            int sequences[] = new int[array.length];
            Arrays.fill(sequences, Integer.MIN_VALUE);
            
            // 開一個陣列放至今為止的長度，然後全部預設都是 1
            int length[] = new int[array.length];
            Arrays.fill(length, 1);
            
            //最長 lis 的位置
            int maxLengthIdx = 0;
            
            for(int i=0; i<array.length; i++){
                
                int currNum = array[i]; //取現在的值
                
                for(int j=0; j < i; j++){ //從 0 一直 loop 到 i
                    
                    int otherNum = array[j]; //拿 i 之前的值
                    
                    //如果 i 之前的值(j)大於 i，而且的 j+1 後的長度比 i 的還要長的話
                    //就把 i 的長度改為 j+1 的長度
                    //再把 i 的 idx 設為 j，表示在這個 i 之前的 lis 是 j
                    if(otherNum < currNum && length[j]+1 >= length[i]){
                        length[i] = length[j] + 1;
                        sequences[i] = j;
                    }
                }
                
                //在 i 的迴圈最後，判斷目前位置的長度和最長的 lis 位置的長度，找出最長那一個的位置
                if(length[i] >= length[maxLengthIdx]) maxLengthIdx = i;
            }
            //最後開一個 function 來把 lis 序列裡的值全部拿出來
            System.out.println(buildSeq(array, sequences, maxLengthIdx));
        }
    }
	
	//用 ArrayList 來存 lis 全部的值
	public static List<Integer> buildSeq(int[] array, int[] sequences, int currentIdx){
		List<Integer> seq = new ArrayList<Integer>();
		
		//currentIdx 是剛才最長 lis 位置，所以用while來跑，一直跑到他變成預設值為止
		while(currentIdx != Integer.MIN_VALUE){
			
			//把他加進 arraylist 的時候，是把他插入在最前面，而不是一直往後
			seq.add(0, array[currentIdx]);
			
			//插入之後，要找下一個位置
			//從sequences那邊可以找到
			currentIdx = sequences[currentIdx];
		}
		return seq;
	}
}
*/