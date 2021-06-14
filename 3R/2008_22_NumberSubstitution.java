import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		for(int cases = 1; cases<=n; cases++){
			String s1 = sc.next();
			String s2 = sc.next();
			String s3 = sc.next();
			sc.nextLine();

			if(!s1.contains(s2)){
				System.out.printf("Case %d: %s\n",cases, s1);
				continue;
			}

			char cArr1[] = s1.toCharArray();
			char cArr2[] = s2.toCharArray();

			int start = 0;
			int end = 0;
			int k = 0;
			boolean same = false;
			for(int i=0; !same && i<cArr1.length; i++){
				k = 0;
				int j = i;
				while(!same){

					if(cArr1[j] == cArr2[k]){
						k++;
						j++;
					}else{
						break;
					}

					if(k == cArr2.length){
						end = j-1;
						start = j-k;
						same = true;
					}
				}
			}
			
			String left = s1.substring(0, start);
			String right = s1.substring(end+1, s1.length());

			StringBuilder sb = new StringBuilder(s3);
			sb = sb.insert(0, left).append(right);

			System.out.printf("Case %d: %s\n",cases, sb.toString());
		}
	}
}