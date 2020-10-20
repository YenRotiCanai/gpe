//https://a7069810.pixnet.net/blog/post/392250625-%5Buva118%5D-mutant-flatworld-explorers

import java.util.Scanner;
import java.util.Arrays;

class p23641{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int edgeX = sc.nextInt();
		int edgeY = sc.nextInt();
		boolean array[][] = new boolean[51][51]; //題目說 max 是 50 格

		for(int i=0; i<51; i++) Arrays.fill(array[i], false);

		while(sc.hasNextInt()){

			int x = sc.nextInt();
			int y = sc.nextInt();
			char position = sc.next().charAt(0);
			String cmd = sc.next();

			for(int i=0; i<cmd.length(); i++){
				if(cmd.charAt(i)=='F'){
					int tempX = x, tempY = y;

					if(position=='N') tempY++;
					else if(position=='S') tempY--;
					else if(position=='W') tempX--;
					else tempX++;

					if(tempX>edgeX || tempY>edgeY || tempX<0|| tempY<0){
						if(!array[x][y]){
							array[x][y]=true;
							System.out.println(x+" "+y+" "+position+" LOST");
							break;
						}
					}else{
						x = tempX;
						y = tempY;
					}

				}else{
					position = findP(position,cmd.charAt(i));
				}
				if(i==cmd.length()-1) System.out.println(x+" "+y+" "+position);
			}
		}
	}

	public static char findP(char p, char cmd){
		switch(cmd){
			case 'R':
				switch(p){
					case 'N':
						p='E';
						break;

					case 'S':
						p='W';
						break;

					case 'W':
						p='N';
						break;

					case 'E':
						p='S';
						break;
				}
				break;
			case 'L':
				switch(p){
					case 'N':
						p='W';
						break;

					case 'S':
						p='E';
						break;

					case 'W':
						p='S';
						break;

					case 'E':
						p='N';
						break;
				}
				break;
		}
		return p;
	}

}













