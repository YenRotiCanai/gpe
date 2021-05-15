import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char arr[] = {'2','2','2','3','3','3','4','4','4','5','5','5','6','6','6','7','7','7','7','8','8','8','9','9','9','9'};

        while(sc.hasNext()){
            String str = sc.nextLine();
            for(int i=0; i<str.length(); i++){
                char chr = str.charAt(i);

                if(chr>='A' && chr<='Z'){
                    int idx = chr - 'A';
                    System.out.print(arr[idx]);
                }
                else System.out.print(chr);
            }

            System.out.println();
        }

    }
}