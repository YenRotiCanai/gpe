    import java.util.*;

    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            int count = 1;
            
            while(sc.hasNext()){
                int h = sc.nextInt();
                int w = sc.nextInt();
                if(h==0 && w==0) break;

                if(count != 1) System.out.println();

                char field[][] = new char[h+5][w+5];
                for(int i=0; i<=h; i++){
                    for(int j=0; j<=w; j++){
                        field[i][j] = '0';
                    }
                }

                for(int i=1; i<=h; i++){
                    String str = sc.next();
                    for(int j=1; j<=w; j++){
                        char d = str.charAt(j-1);

                        if(d=='*'){
                            field[i][j] = '*';

                            for(int m = -1; m<=1; m++){
                                for(int n = -1; n<=1; n++){
                                    if(field[m+i][n+j]!='*')
                                        field[m+i][n+j]++;
                                }
                            }
                        }
                    }
                }

                System.out.println("Field #" + count + ":");
                for(int i=1; i<=h; i++){
                    for(int j=1; j<=w; j++){
                        System.out.print(field[i][j]);
                    }
                    System.out.println();
                }
                count++;
            }
        }
    }
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		long table[] = new long[51];
		table[0] = table[1] = 1;

		for(int i=2; i<51; i++){
			table[i] = table[i-1] + table[i-2];
		}
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(table[n]);
		}
	}
}
