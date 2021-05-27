//https://a7069810.pixnet.net/blog/post/394976245-%5Buva11000%5D-bee
//母 = 上一代的公 + 1
//公 = 上一代的總數（公+母）
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong()){
			long N = sc.nextLong();
			if(N == -1) break;

			//temp 拿來暫存這一代的數量，全部算好後才給正式的
			long f = 1, m = 0, f_temp = 0, m_temp = 0;
			while(N>0){
				f_temp  = m + 1; // 母 = 上一代公 + 1
				m_temp = f + m; // 公 = 上一代總數

				f = f_temp;
				m = m_temp;
				N--;
			}


			System.out.println(m + " " + (f+m));
		}
	}
}