//Java
import java.util.Scanner;

class uva10279{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			if(i!=0) System.out.println("");
			int n=sc.nextInt();
			char map[][]=new char[n][n]; //地圖
			char choose[][]=new char[n][n]; //紀錄使用者輸入的x
			int aroundBomb[][]=new int[n][n]; //座標周圍炸彈數
			int direction[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
			
			//讀取地圖
			for(int j=0;j<n;j++){
				String st=sc.next();
				for(int k=0;k<n;k++) map[j][k]=st.charAt(k);
			}
			//讀取使用者所輸入的x
			for(int j=0;j<n;j++){
				String st=sc.next();
				for(int k=0;k<n;k++) choose[j][k]=st.charAt(k);
			}
			//計算點周圍的炸彈數
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					int count=0;
					for(int z=0;z<direction.length;z++){
						int row=j+direction[z][0],col=k+direction[z][1];
						if(row>=0 && row<n && col>=0 && col<n && map[row][col]=='*') count++;
					}
					aroundBomb[j][k]=count;
				}
			}
			
			//是否有踩到炸彈
			boolean flag=true;
			for(int j=0;j<n;j++) for(int k=0;k<n;k++) if(choose[j][k]=='x') if(map[j][k]=='*') flag=false;
			
			//Output
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(choose[j][k]=='x' && map[j][k]!='*') System.out.print(aroundBomb[j][k]);
					else if(!flag && map[j][k]=='*') System.out.print("*");
					else System.out.print(".");


				}
				System.out.println();
			}
		}
	}
}