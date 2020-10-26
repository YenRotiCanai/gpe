import java.util.*;

class test2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            if(str.equals(".")) break;

            for(int i=0; i<str.length(); i++){
                sb.append(str.charAt(i));
                System.out.printf("i:%d, sb:%s,",i,sb);

                if(str.length() % sb.length() != 0) continue;

                boolean b = true;

                for(int j=0; j<str.length(); j+=sb.length()){
                    System.out.printf(" j:%d, str.sub:%s%n",j,str.substring(j, j+sb.length()));

                    if(!str.substring(j,j+sb.length()).equals(sb.toString())){
                        b = false;
                        break;
                    }
                }
                if(b) break;
            }
            System.out.println(str.length()/sb.length());
        }
    }
}