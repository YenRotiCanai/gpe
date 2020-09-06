import java.util.Scanner;
import java.util.Arrays;

class Hartals{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt(); //no. of cases
		while((--cases)>=0){
			int d = sc.nextInt(); //no. of days
			int p = sc.nextInt(); //no. of parties

			int days[] = new int[d+1]; //因為 arr 第一個是0開頭，所以要加 1
			int party[] = new int[p];

			for(int i=0; i<p; i++) { //先把每個黨派的罷工天數存進來
				party[i] = sc.nextInt();
				//System.out.println("p: "+ party[i]);
			}

			for(int i=0; i<p; i++){
				int multRec = 0; //記錄天數的倍數
				for(int j=1; j<d+1; j++){
					multRec = party[i] * j; //計算罷工的倍數
					//System.out.println("multRec: " + multRec);測試

					if(multRec < d+1){ //防止他大於限定的天數
						days[multRec] = 1; //如果是在限定天數內, 就把他在陣列裡 +1
					}else{
						break;
					}
					//System.out.println(Arrays.toString(days));
				}
			}

			int count = 0; //存罷工天數
			for(int i =0; i<d+1; i++){ //判斷是否是周日 (五/六)
				if( i%7!=6 && i%7!=0 && days[i]==1 ){ //用 mod 也就是取餘數的方式來檢查, 如果是 6 或者 0, 就代表是周日, 就不行. 再來就是檢查那一天必須要有罷工紀錄, 才可以加進去 count 裡面
					count ++;
				}
			}
			System.out.println(count);

		}
		
	}
}