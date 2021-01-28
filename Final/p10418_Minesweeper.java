//10418:Minesweeper

import java.util.Scanner;

class temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T=0, h, w;

        while(sc.hasNext() && (h=sc.nextInt())!=0 && (w=sc.nextInt())!=0){
        	if(T!=0) System.out.println();

        	char field[][] = new char[h+2][w+2];

        	for(int i=1; i<=h; i++){
        		for(int j=1; j<=w; j++){
        			field[i][j] = '0';
        		}
        	}

        	for(int i=1; i<=h; i++){
        		String st = sc.next();
        		for(int j=1; j<=w; j++){
        			char d = st.charAt(j-1);

        			if(d=='*'){
        				field[i][j] = '*';

        				for(int m=-1; m<=1; m++){
        					for(int n=-1; n<=1; n++){
        						if(field[m+i][n+j]!='*')
        							field[m+i][n+j]++;
        					}
        				}
        			}
        		}
        	}

        	System.out.println("Field #"+(++T)+":");
        	for(int i=1; i<=h; i++){
        		for(int j=1; j<=w; j++){
        			System.out.print(field[i][j]);
        		}
        		System.out.println();
        	}
        }
    }
}