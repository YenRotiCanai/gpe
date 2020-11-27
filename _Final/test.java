import java.util.*;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<String> vt = new Vector<String>();

        int cases = 0;
        int maxLen = 0;

        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.length()>maxLen) maxLen = str.length();

            vt.add(str);
            cases++;
        }

        int count = 0;

        for(int i=0; i<maxLen; i++){
            count =0;
            for(int j=cases-1; j>=0; j--){
                if(!(i>=vt.get(j).length())){
                    while(count > 0){
                        System.out.print(" ");
                        count--;
                    }
                    System.out.print(vt.get(j).charAt(i));
                    count = 0;
                }else count++;
            }
            System.out.println();
        }
    }
}