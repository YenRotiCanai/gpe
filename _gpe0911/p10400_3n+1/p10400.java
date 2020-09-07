import java.util.Scanner;

class p10400{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print(a +" "+ b +" ");
			// System.out.println();

			if(a>b){
				int c = a;
				a = b;
				b = c;
			}

			int maxLen = 0;
			for(int k=a; k<=b; k++){
				int n=k, len=1;
				// System.out.printf("k:%d, n:%d, maxLen:%d\n",k,n,maxLen);

				while(true){
					if(n==1) break;
					if(n%2==1) n=n*3+1; //mod2 == 1就是奇數
					else n/=2;
					// System.out.printf("n2:%d\n",n);
					len++; 
				}
				//System.out.println(k);
				maxLen = Math.max(maxLen, len);
				// System.out.println(maxLen);
			}

			System.out.println(maxLen);
		}
	}
}