import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            
            String str = sc.nextLine();
            if(str.equals(".")) break;

            char c[] = str.toCharArray();

            int len = str.length();
            boolean flag = false;

            for(int i=1; i<=len; i++){
                if(len%i != 0) continue;
                flag = true;
                for(int j=i; j<len && flag==true; j+=i){
                    for(int k=0; k<i && flag==true; k++){
                        if(c[k]!=c[j+k]) flag = false;
                    }
                }

                if(flag){
                    System.out.println(len/i);
                    break;
                }
            }
        }
    }
}