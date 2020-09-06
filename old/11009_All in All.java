import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			
			//輸入測值
			String input[] = sc.nextLine().split(" ");
			String s = input[0];
			String t = input[1];
			// System.out.println(s.length());
			// System.out.println(t.length());

			//如果 s>t 就不可能有sub
			if(s.length() > t.length()){
				System.out.println("No");
			}

			String [] Arr1 = new String[s.length()];
			String [] Arr2 = new String[t.length()];
			int count=0;
			int save=0;

			for(int i=0;i<s.length();i++){
				Arr1[i] = s.substring(i,i+1);
				//System.out.println(Arr1[i]);
			}

			for(int j=0;j<t.length();j++){
				Arr2[j] = t.substring(j,j+1);
				//System.out.println(Arr2[j]);
			}

			for(int k=0;k<s.length();k++){
				
				//System.out.println("---k: "+k);
				for(int h=save;h<t.length();h++){
					//System.out.println("h: "+h);
					if(Arr1[k].equals(Arr2[h])){
						//System.out.println("Yes, h: "+ h + ", save: "+ save);
						save = h;
						//System.out.println("Save: "+save);
						count++;
						//System.out.println(Arr2[h]);
						break;
					}
				}
			}

			if(count == s.length()){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		}
	}
}