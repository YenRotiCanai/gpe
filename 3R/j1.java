import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean first = true;
	
		while(sc.hasNext()){
			if(!first) System.out.println();
			first = false;

			String s1 = sc.next();
			String s2 = sc.next();

			System.out.printf("%s (to %s)\n", s1, s2);

			if(s1.length()<2){
				System.out.println("Unknown conjugation");
				continue;
			}

			String suf = s1.substring(s1.length()-2, s1.length());

			if(!suf.equals("ar") && !suf.equals("er") && !suf.equals("ir")){
				System.out.println("Unknown conjugation");
				continue;
			}

			char tv = s1.charAt(s1.length()-2);

			// if(tv!='a' && tv!='e' && tv!='i'){
			// 	System.out.println("Unknown conjugation");
			// 	continue;
			// }

			String root = s1.substring(0, s1.length()-2);
		
			if(tv == 'i'){
				System.out.printf("%-10s%so\n", "eu", root);
				System.out.printf("%-10s%ses\n", "tu", root);
				System.out.printf("%-10s%se\n", "ele/ela", root);
				System.out.printf("n%cs       %s%cmos\n", (char)243, root, tv);
				System.out.printf("v%cs       %s%cs\n", (char)243, root, tv);
				System.out.printf("%-10s%sem\n", "eles/elas", root);
			}else{
				System.out.printf("%-10s%so\n", "eu", root);
				System.out.printf("%-10s%s%cs\n", "tu", root, tv);
				System.out.printf("%-10s%s%c\n", "ele/ela", root, tv);
				System.out.printf("n%cs       %s%cmos\n", (char)243, root, tv);
				System.out.printf("v%cs       %s%cis\n", (char)243, root, tv);
				System.out.printf("%-10s%s%cm\n", "eles/elas", root, tv);
			}
			
		}
	}
}