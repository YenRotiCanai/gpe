import java.util.Scanner;


public class p10414 {
    static StringBuilder sb = new StringBuilder();
    static String str ;
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int count=1;
        while(in.hasNext()){
            sb = new StringBuilder();
            str =in.nextLine();
            int inin = 100;
            
            try {
                inin=Integer.parseInt(str);
            } catch (Exception e) {
            }
            
            if(inin<100){
                System.out.printf("%d. %s\n",count++,Integer.parseInt(str));
                continue;
            }else{
            addText("", 2);
            }
            
            int i=1;
            while(i==1){
                try{
            addText(" shata ", 1);
            addText(" hajar ", 2);
            addText(" lakh ", 2);
            addText(" kuti ", 2);
                }catch(StringIndexOutOfBoundsException e){
                    break;
                }
            }
            System.out.printf("%d. %s\n",count++,sb);
        }
        
    }
    static void addText(String unit ,int num){
        String temp = "";
        if(str.length()>1){
            temp = str.substring(str.length()-num, str.length());
        }else {
            temp = str.substring(str.length()-1, str.length());
        }
        
        int tempi = Integer.parseInt(temp);
        if(tempi!=0){
        sb.insert(0,tempi+unit);
        }
        str = str.substring(0,str.length()-num);
    }
}