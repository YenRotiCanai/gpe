import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s1 = sc.nextLine().toLowerCase();
			String s2 = sc.nextLine().toLowerCase();

			int x = 0, y = 0;

            //只抓字母，抓出來後把值加起來
			for(int i=0; i<s1.length(); i++){
				char c = s1.charAt(i);
				if(c >='a' && c <= 'z') x += c - 'a' +1;
			}

			for(int i=0; i<s2.length(); i++){
				char c = s2.charAt(i);
				if(c >='a' && c <= 'z') y += c - 'a' +1;
			}

            //計算每一個數字的總和
			x = calc(x);
			y = calc(y);

            //小的放上面做分子，大的做分母
			if(x>y){
				int tmp = x;
				x = y;
				y = tmp;
            }

            //轉換成 float 才乘
			float ans = (float)x / (float)y * 100f;
			System.out.printf("%.2f %%\n", ans);
		}
	}

    //加總每個數字，直到變成個位數為止
	static int calc(int n){
        //只要大過 9 就不是個位數
		while(n>9){
            int total = 0;
            
            //將每個數字取出來加總起來，這邊用mod抓個位數
			while(n>0){
				total += n%10;
				n/=10;
            }
            //取總和後，再丟回給 n，讓迴圈判斷是不是個位數
			n = total;
		}
		return n;
	}
}