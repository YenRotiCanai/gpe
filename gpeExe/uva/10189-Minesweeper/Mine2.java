import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = 0,h,w;
        
        while((sc.hasNext()) && (h=sc.nextInt())!=0 && (w=sc.nextInt())!=0 ){
            if(T!=0) System.out.println(""); //這裡是為了系統的要求，不然直接Scanner input看出來的會和考試卷給的不一樣
            
            char field[][] = new char[105][105];

            //初始化陣列，讓他每一個都先預設為 0
            for(int i=1; i<=h; i++){
            	for(int j=1; j<=w; j++){
            		field[i][j] = '0';
            	}
            }

            for(int i=1; i<=h; i++){
            	String c = sc.next(); //把每一行先讀進來
            	for(int j=1; j<=w; j++){
                    char d = c.charAt(j-1); //然後用charAt抓裡面的字元
            		if(d == '*'){ //判斷他是不是地雷
            			field[i][j] = '*';

                        //把地雷的周圍統統 +1
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
			//System.out.println("");
        }
    }
}