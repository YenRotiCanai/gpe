import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String kyb = "=-0987654321][poiuytrewq';lkjhgfdsa/.,mnbvcxz   ";

        while(sc.hasNext()){
            String str = sc.nextLine().toLowerCase();
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<str.length(); i++){
                for(int j=0; j<kyb.length(); j++){
                    if(str.charAt(i) == kyb.charAt(j)){
                        sb.append(kyb.charAt(j+2));
                        break;
                    }
                }
            }

            System.out.println(sb);
        }
	}
}