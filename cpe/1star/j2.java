import java.util.*;

class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        ArrayList<String> fingers = new ArrayList<String>();
        Set<Character> st = new HashSet<Character>();
        ArrayList<String> boss = new ArrayList<String>();

        while(sc.hasNext()){

            fingers.clear();
            st.clear();
            boss.clear();

			fingers.add("qaz");
            fingers.add("wsx");
            fingers.add("edc");
            fingers.add("rfvtgb");
            fingers.add("space");
            fingers.add("space");
            fingers.add("yhnujm");
            fingers.add("ik,");
            fingers.add("ol.");
			fingers.add("p;/");

            int f = sc.nextInt();
            int n = sc.nextInt();

            for(int i=1; i<=f; i++){
                int hurt = sc.nextInt();
                fingers.remove(hurt-i);
            }

            //System.out.println(fingers);

            for(int i=0; i<fingers.size(); i++){
                String str = fingers.get(i);
                for(int j=0; j<str.length(); j++){
                    st.add(str.charAt(j));
                }
            }

            int max = 0;
            
            for(int i=0; i<n; i++){
                String word = sc.next();
				boolean reject = false;
				
                for(int j=0; j<word.length(); j++){
                    char chr = word.charAt(j);
                    if(!st.contains(chr)){
                        reject = true;
                        break;
                    }
                }

                if(!reject){
					if(word.length() > max) max = word.length();
					//System.out.println("word Pass:"+word);
                    boss.add(word);
                }
			}
			
			//System.out.println();
			//System.out.println("max:" + max + ", bossSize:" + boss.size() + boss);

			int count = 0;
			for(String s1:boss){
				if(s1.length() == max) {
					count ++;
				}
			}

			System.out.println(count);
			for(String s2:boss){
				if(s2.length() == max) System.out.println(s2);
			}


            // for(int i=0; i<boss.size(); i++){
			// 	String bossGet = boss.get(i);
			// 	int len = bossGet.length();

			// 	System.out.println("bossGet:" + bossGet + ", len:" + len);

			// 	if(len != max) boss.remove(i);
            //     //if(boss.get(i).length() != max) boss.remove(i);
            // }

			// System.out.println(boss.size());
			
            // for(String s:boss){
            //     System.out.println(s);
            // }
        }
    }
}