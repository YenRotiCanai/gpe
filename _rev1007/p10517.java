import java.util.*;

class p10517{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		while(cases-->0){
			int d = sc.nextInt();
			int p = sc.nextInt();

			int days[] = new int[d+1];
			int party[] = new int[p];

			//用arr記錄罷工天倍數
			for(int i=0; i<p; i++){
				party[i] = sc.nextInt();
			}

			//算實際罷工的日期
			for(int i=0; i<p; i++){
				int multRec = 0;
				for(int j=1; j<d+1; j++){
					multRec = party[i]*j; //利用乘法算出實際日期

					if(multRec < d+1) days[multRec] = 1; //如果日期在罷工天數以內，就+1
					else break;//不然就break
				}
			}

			int count = 0;
			for(int i=0; i<d+1; i++){
				//以 7 取餘數（mod）來排除禮拜五（餘6）和禮拜六（餘0）
				//而且要有一筆紀錄，才可以加在罷工天數裡面
				if(i%7!=6 && i%7!=0 && days[i]==1){
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}