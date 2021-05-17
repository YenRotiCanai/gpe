import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean first = true;

        while(n--!=0){
            if(!first) System.out.println();
            String str = sc.next();
            int len = str.length();

            for(int i=1; i<=len; i++){
                if(len%i==0){
                    boolean flag = true;
                    for(int j=i; j<len; j++){
                        if(str.charAt(j) != str.charAt(j%i)){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println(i);
                        break;
                    }
                }
            }
            first = false;
        }
    }
}