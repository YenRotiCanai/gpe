//pg191

import java.util.Scanner;

class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            
            String str = sc.nextLine();
            if(str.equals(".")) break;

            char c[] = str.toCharArray();

            int len = str.length();
            boolean flag = false;

            System.out.println("len:"+len);

            for(int i=1; i<=len; i++){
                // 如果 i 不是 len 的因數，那他就不會是 a，直接跳下一輪
                if(len%i != 0) continue; 

                System.out.println("i:"+i);

                flag = true;
                for(int j=i; j<len && flag==true; j+=i){
                    System.out.println("j:"+j);
                    for(int k=0; k<i && flag==true; k++){
                        System.out.println("k:"+k);
                        if(c[k]!=c[j+k]) flag = false;
                    }
                }
                System.out.println(flag);

                if(flag){
                    System.out.println(len/i);
                    break;
                }
                System.out.println("continue");
            }
        }
        sc.close();
    }
}