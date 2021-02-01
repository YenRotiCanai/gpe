import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.nextLine();
            boolean first = true;

            while(str.contains("\"")){
                if(first) {
                    str = str.replaceFirst("\"", "``");
                    first = false;
                }else{
                    str = str.replaceFirst("\"", "''");
                    first = true;
                }
            }
            

            System.out.println(str);
        }
	}
}