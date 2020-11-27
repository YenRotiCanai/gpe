import java.util.*;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<String> vt = new Vector<String>();

        int cases = 0; //有多少字串
        int maxLen = 0; //最長字串長度

        //讀入字串
        while(sc.hasNext()){
            String st = sc.nextLine();
            if(st.length()>maxLen) maxLen=st.length();
            vt.add(st);
            cases++;
        }

        int count=0; //為了格式，計算需要多少空白

        //一個字一個字抓
        for(int i=0; i<maxLen; i++){
            count = 0; //初始化空白數
            for(int j=cases-1; j>=0; j--){
                if(!(i>=vt.get(j).length())){
                    while(count>0){
                        System.out.print(" ");
                        count--;
                    }
                    System.out.print(vt.get(j).charAt(i)); //印出字
                    count=0;
                }else count++;
            }
            System.out.println();
        }
    }
}