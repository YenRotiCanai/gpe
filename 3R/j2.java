import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int button[][] = {
            {0,1,1,1,0,0,1,1,1,1},
            {0,1,1,1,0,0,1,1,1,0},
            {0,1,1,1,0,0,1,1,0,0},
		 	{0,1,1,1,0,0,1,0,0,0},
		 	{0,1,1,1,0,0,0,0,0,0},
		 	{0,1,1,0,0,0,0,0,0,0},
		 	{0,1,0,0,0,0,0,0,0,0},
		  	{0,0,1,0,0,0,0,0,0,0},
		  	{1,1,1,1,0,0,1,1,1,0},
		  	{1,1,1,1,0,0,1,1,0,0},
		  	{1,1,1,1,0,0,1,0,0,0},
		  	{1,1,1,1,0,0,0,0,0,0},
		  	{1,1,1,0,0,0,0,0,0,0},
		  	{1,1,0,0,0,0,0,0,0,0},
        };

        HashMap<Character, int[]> fingers = new HashMap<Character, int[]>();
        fingers.put('c',button[0]);
        fingers.put('d',button[1]);
        fingers.put('e',button[2]);
		fingers.put('f',button[3]);
		fingers.put('g',button[4]);
		fingers.put('a',button[5]);
		fingers.put('b',button[6]);
		fingers.put('C',button[7]);
		fingers.put('D',button[8]);
		fingers.put('E',button[9]);
		fingers.put('F',button[10]);
		fingers.put('G',button[11]);
		fingers.put('A',button[12]);
		fingers.put('B',button[13]);

        int n = sc.nextInt();
        sc.nextLine();

        while(n-->0){

            int count[] = new int[10];
            int cur[] = new int[10];
            String str = sc.nextLine();

            for(int i=0; i<str.length(); i++){
                int next[] = fingers.get(str.charAt(i));

                for(int j=0; j<10; j++){
                    if(cur[j] < next[j]) count[j]++;

                    cur[j] = next[j];
                }
            }

            StringBuilder sb = new StringBuilder(count[0]+"");
            for(int i=1; i<10; i++) sb.append(" "+count[i]);

            System.out.println(sb);
        }
	}
}