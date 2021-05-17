import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sc.nextLine();

        boolean first = true;

        while(n-->0){
            if(!first) System.out.println();

            char cArr[] = sc.nextLine().toCharArray();
            boolean flag = false;

            for(int i=1; i<cArr.length; i++){
                flag = true;

                for(int j=i; j<cArr.length && flag==true; j+=i){
                    for(int k=0; k<i && flag==true; k++){
                        if(cArr[k] != cArr[k+j]) flag = false;
                    }
                }

                if(flag){
                    System.out.println(i);
                    break;
                }
            }
            first = false;
        }
    }
}