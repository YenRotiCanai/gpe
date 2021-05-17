import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        HashMap<Character,Character> hm = new HashMap<Character, Character>();

        hm.put('A','A'); hm.put('E','3'); hm.put('H','H'); hm.put('I','I');
        hm.put('J','L'); hm.put('L','J'); hm.put('M','M'); hm.put('O','O');
        hm.put('S','2'); hm.put('T','T'); hm.put('U','U'); hm.put('V','V');
        hm.put('W','W'); hm.put('X','X'); hm.put('Y','Y'); hm.put('Z','5');
        hm.put('1','1'); hm.put('2','S'); hm.put('3','E'); hm.put('5','Z');
        hm.put('8','8');

        while(sc.hasNext()){
            boolean P = false;
            boolean M = true;
            
            String str = sc.nextLine();
            
            StringBuilder sb = new StringBuilder(str);
            String strReversed = sb.reverse().toString();
            if(str.equals(strReversed)) P = true;

            for(int i=0; i<str.length()/2+1; i++){
                char c1 = str.charAt(i);
                char c2 = str.charAt(str.length()-i-1);

                if(hm.containsKey(c1) && hm.containsKey(c2)){
                    char c1R = hm.get(c1);
                    char c2R = hm.get(c2);

                    //System.out.println(c1 +" "+c2);

                    if(c1 != c2R || c2 != c1R) M = false;

                }else M = false;
                
            }

            if(P){
                if(M) {
                    System.out.println(str + " -- is a mirrored palindrome."+"\n");
                }else System.out.println(str + " -- is a regular palindrome."+"\n");
            }else if(M){
                System.out.println(str + " -- is a mirrored string."+"\n");
            }else System.out.println(str + " -- is not a palindrome."+"\n");
        }
    }
}