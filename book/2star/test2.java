import java.util.*;

class test2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int check = 131071;
        String str;
        while((str=sc.nextLine())!=null){
            if(str.trim().length()>=2 && str.endsWith("#")){
                long erg = 0;
                for(char c:str.toCharArray()){
                    long dec = c - '0';
                    if(dec == 1 || dec == 0){
                        dec = 2*dec+erg;
                        erg = dec%check;
                    }
                }
                if(erg == 0) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}