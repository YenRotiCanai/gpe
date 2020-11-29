//p23551_LargestSquare.java
//https://a7069810.pixnet.net/blog/post/395939704-%5Buva10908%5D-largest-square

import java.util.Scanner;

class temp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        while(cases-->0){
        	int m = sc.nextInt();
        	int n = sc.nextInt();
        	int q = sc.nextInt();

        	char grid[][] = new char[m][n];

        	for(int i=0; i<m; i++){
        		String st = sc.next();
        		for(int j=0; j<n; j++){
        			grid[i][j] = st.charAt(j);
        		}
        	}

        	System.out.println(m+" "+n+" "+q);

        	while(q-->0){
        		int m2 = sc.nextInt();
        		int n2 = sc.nextInt();

        		char cmp = grid[m2][n2];

        		//以原點為中心，和四周比較看看是不是和原點一樣
        		int i=0;//擴張的程度
        		for(i=0; i<m; i++){
        			boolean flag = true;
        			for(int j=m2-i; j<=m2+i; j++){
        				for(int k=n2-i; k<=n2+i; k++){
        					if(j<0 || k<0 || j>=m || k>=n || cmp!=grid[j][k]){
        						flag = false;
        						break;
        					}
        				}
        			}
        			if(!flag) break;
        		}
        		System.out.println(i*2-1);
        	}
        }
    }
}