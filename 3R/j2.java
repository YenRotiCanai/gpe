import java.util.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            char c1[] = new char[150];
            char c2[] = new char[150];

            for(int i=0; i<s1.length(); i++){
                c1[s1.charAt(i)]++;
            }

            for(int i=0; i<s2.length(); i++){
                c2[s2.charAt(i)]++;
            }

            for(char c='a'; c<='z'; c++){
                for(int k=1; k<=Math.min(c1[c], c2[c]); k++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
	}
}