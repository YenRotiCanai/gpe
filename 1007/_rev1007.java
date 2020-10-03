import java.util.Scanner;

public class p22131 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean backquote=true;
		while(in.hasNext()){
			String str = in.nextLine();
			while(str.contains("\"")){
				if(backquote){
					str=str.replaceFirst("\"","``");
				}else {
					str=str.replaceFirst("\"", "''");
				}
				backquote=!backquote;
			}
			System.out.println(str);
		}
	}
}