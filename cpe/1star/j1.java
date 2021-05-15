import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            String s1 = st.nextToken();
            int b1 = Integer.parseInt(st.nextToken());
            int b2 = Integer.parseInt(st.nextToken());

            //System.out.printf("s1:%s, b1:%d, b2:%d.%n", s1, b1, b2);

            //to Base10
            long b10 = 0;
            long j = 1;
            for(int i = s1.length()-1; i>=0; i--){
                char chr = s1.charAt(i);
                
                if(chr <= '9') b10 += (chr - '0') * j;
                else b10 += (chr - 'A'+10) * j;
                
                j *= b1;
            }

            ArrayList<Integer> arr = new ArrayList<Integer>();
            while(b10 > 0){
                arr.add((int)(b10 % b2));
                b10 /= b2;
            }

            if(arr.size()>7){
                System.out.println("  ERROR");
                continue;
            }else{
                for(int i=7; i>arr.size(); i--){
                    System.out.print(" ");
                }

                for(int i=arr.size()-1; i>=0; i--){
                    int out = arr.get(i);
                    //System.out.println("out:"+out);
                    if(out > 9){
                        char chrOut = (char)(out - 10 + 'A');
                        System.out.print(chrOut);
                    }else System.out.print(out);
                }
                System.out.println();
            }
        }
    }
}
