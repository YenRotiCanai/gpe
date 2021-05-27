//只有treeset才會排序
//不能用 arraylist remove 來刪除，因為他的順序會一直更新
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //存可以用的字元
        Set<Character> st = new HashSet<Character>();
        
        //存最後的答案，只有treeset才會幫忙排序！
        Set<String> st2 = new TreeSet<String>();

        while(sc.hasNext()){
            String arr[] = {"qaz", "wsx", "edc", "rfvtgb", " ", " ", "yhnujm", "ik,", "ol.", "p;/"};

            //先清掉上一次的
            st.clear();
            st2.clear();

            int f = sc.nextInt();
            int n = sc.nextInt();

            //把受傷的手指換掉
            for(int i=0; i<f; i++){
                int hurt = sc.nextInt();
                arr[hurt-1] = "";
            }

            //找出完好的手指，挖出他的字元
            //因為不需要重複的字元，所以放進 set 裡面
            for(int i=0; i<10; i++){
                if(arr[i]=="") continue;
                String str = arr[i];
                for(int j=0; j<str.length(); j++){
                    st.add(str.charAt(j));
                }
            }

            int max = 0;
            for(int i=0; i<n; i++){
                String word = sc.next(); //不能用nextLine
                boolean reject = false;

                //只要有一個字元不能打（沒有在set裡面），就拒絕
                for(int j=0; j<word.length(); j++){
                    char chr = word.charAt(j);
                    if(!st.contains(chr)){
                        reject = true;
                        break;
                    }
                }

                //如果沒有被拒絕，就看他的長度是一樣長還是更大
                if(!reject){

                    //如果更大，就清空之前的答案set，放新的
                    //如果一樣，就直接加進去答案set
                    if(word.length() > max){
                        max = word.length();
                        st2.clear();
                        st2.add(word);
                    }else if(word.length() == max){
                        st2.add(word);
                    }
                }
            }

            //最後印出來
            System.out.println(st2.size());
			for(String s2:st2){
				System.out.println(s2);
			}
        }
    }
}